#include <bits/stdc++.h>
#include <unistd.h>
using namespace std;

void typeText(const string &text, int delay = 20000) {
    for (char c : text) {
        cout << c << flush;
        usleep(delay);
    }
    cout << endl;
}

void printColored(const string &text, const string &color, bool blink = false) {
    string code;
    if (color == "red") code = "\033[1;31m";
    else if (color == "green") code = "\033[1;32m";
    else if (color == "yellow") code = "\033[1;33m";
    else if (color == "cyan") code = "\033[1;36m";
    else code = "\033[0m";

    if (blink) code += "\033[5m"; 
    cout << code << text << "\033[0m" << flush;
}

struct PasswordReport {
    int score;
    bool hasLower, hasUpper, hasDigit, hasSymbol;
    string strength;
};

PasswordReport analyzePassword(const string &pw) {
    PasswordReport report = {0, false, false, false, false, ""};

    if (pw.length() >= 8) report.score += 20;
    if (pw.length() >= 12) report.score += 10;

    for (char c : pw) {
        if (islower(c)) report.hasLower = true;
        else if (isupper(c)) report.hasUpper = true;
        else if (isdigit(c)) report.hasDigit = true;
        else report.hasSymbol = true;
    }

    if (report.hasLower) report.score += 10;
    if (report.hasUpper) report.score += 10;
    if (report.hasDigit) report.score += 20;
    if (report.hasSymbol) report.score += 20;

    if (report.score <= 30) report.strength = "Very Weak";
    else if (report.score <= 50) report.strength = "Weak";
    else if (report.score <= 70) report.strength = "Medium";
    else report.strength = "Strong";

    return report;
}

string suggestAttack(const PasswordReport &report) {
    if (report.strength == "Very Weak") return "Brute-force attack in seconds!";
    if (report.strength == "Weak") return "Dictionary attack in minutes.";
    if (report.strength == "Medium") return "Hybrid attack in hours.";
    if (report.strength == "Strong") return "Offline GPU attack may take months/years.";
    return "Unknown";
}

string randomGuess(int len) {
    string chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+";
    string guess = "";
    for (int i = 0; i < len; i++)
        guess += chars[rand() % chars.size()];
    return guess;
}

void simulateCrack(const string &pw, const PasswordReport &report) {
    int len = pw.size();
    int totalAttempts = max(50, len * 15);
    double estimatedTime = (100.0 - report.score) * 0.1;

    typeText("\nStarting hacking simulation...\n", 40000);
    usleep(500000);

    cout << "Progress: [";
    int barWidth = 50;
    for (int i = 0; i <= barWidth; i++) cout << " ";
    cout << "] 0%" << flush;
    cout << "\rProgress: [" << flush;

    for (int i = 0; i <= barWidth; i++) {
        cout << "#";
        cout.flush();
        usleep((useconds_t)(50000 + (i * estimatedTime * 2000)));
    }
    cout << "] 100%\n";

    typeText("Simulated attacker is trying passwords...\n", 30000);

    bool cracked = false;
    for (int i = 0; i < totalAttempts; i++) {
        string guess = randomGuess(len);
        if (report.strength == "Very Weak" && i == totalAttempts / 2) {
            guess = pw; 
            cracked = true;
        }
        cout << "\rTrying: ";
        printColored(guess, "yellow", i % 3 == 0);
        usleep(30000 + (rand() % 50000));
        if (cracked) break;
    }
    cout << "\r";

    if (cracked) {
        for (int i = 0; i < 5; i++) {
            cout << "\a" << flush;  
            usleep(200000);
        }
        printColored("Password cracked! ✅ Password: " + pw + "\n", "red", true);
    } else {
        printColored("Password not cracked! ✅ Simulation complete.\n", "green");
    }
}

int main() {
    srand(time(0));
    system("clear");

    typeText("=== 🔐 Cyber Password Strength Analyzer + Hacker Simulation ===", 40000);

    string pw;
    typeText("Enter your password: ", 30000);
    cin >> pw;

    typeText("\nAnalyzing password...\n", 50000);
    sleep(1);

    PasswordReport report = analyzePassword(pw);

    string color = "red";
    if (report.strength == "Medium") color = "yellow";
    if (report.strength == "Strong") color = "green";

    printColored("Password Strength: " + report.strength, color);
    cout << " | Score: " << report.score << "/100\n";

    cout << "\nComponents:\n";
    cout << "- Lowercase: " << (report.hasLower ? "Yes" : "No") << "\n";
    cout << "- Uppercase: " << (report.hasUpper ? "Yes" : "No") << "\n";
    cout << "- Digit: " << (report.hasDigit ? "Yes" : "No") << "\n";
    cout << "- Symbol: " << (report.hasSymbol ? "Yes" : "No") << "\n";

    string attack = suggestAttack(report);
    cout << "\nPredicted attack type: ";
    printColored(attack, "yellow");

    cout << "\nTips to improve your password:\n";
    if (!report.hasLower) cout << "- Add lowercase letters.\n";
    if (!report.hasUpper) cout << "- Add uppercase letters.\n";
    if (!report.hasDigit) cout << "- Include numbers.\n";
    if (!report.hasSymbol) cout << "- Add symbols (!@#$%^&*).\n";
    if (pw.length() < 12) cout << "- Use at least 12 characters.\n";

    simulateCrack(pw, report);

    printColored("\nStay safe! 🔒", "cyan");

    return 0;
}