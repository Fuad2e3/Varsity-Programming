#include<stdio.h>

#define max 25

void main()

{


    int frag[max], b[max], f[max], i, j, nb, nf, temp, highest=0;
    int bf[max], ff[max];

    // প্রথমে সব অ্যারে শূন্যে ইনিশিয়ালাইজ করা হলো
    for(i=0; i<max; i++){
        b[i] = 0;      // block size রাখার জন্য
        f[i] = 0;      // file size রাখার জন্য
        frag[i] = 0;   // fragmentation রাখার জন্য (অর্থাৎ ফাইল কত ফাঁকা জায়গায় বসছে)
        bf[i] = 0;     // block allocation flag (কোন block নেওয়া হয়েছে কিনা)
        ff[i] = 0;     // file allocation flag (ফাইল কোন block এ বসেছে)
    }

    // block এর সংখ্যা ইনপুট নেওয়া হচ্ছে
    printf("\nEnter the number of blocks:");
    scanf("%d",&nb);

    // file এর সংখ্যা ইনপুট নেওয়া হচ্ছে
    printf("Enter the number of files:");
    scanf("%d",&nf);

    // প্রতিটি block এর size ইনপুট নিচ্ছি
    printf("\nEnter the size of the blocks:−\n");
    for(i=1; i<=nb; i++)
    {
        printf("Block %d:",i);
        scanf("%d",&b[i]);
    }

    // প্রতিটি file এর size ইনপুট নিচ্ছি
    printf("Enter the size of the files:−\n");
    for(i=1; i<=nf; i++)
    {
        printf("File %d:",i);
        scanf("%d",&f[i]);
    }

    // Allocation শুরু - প্রতিটি file কে block এ allocate করার চেষ্টা করা হচ্ছে
    for(i=1; i<=nf; i++)
    {
        for(j=1; j<=nb; j++)
        {
            // যদি block টি আগেই allocate না হয়ে থাকে (bf[j] != 1)
            if(bf[j]!=1)
            {
                temp = b[j] - f[i];   // block size থেকে file size বাদ দিচ্ছি, ফাঁকা জায়গা কত হবে
                if(temp >= 0)  {                    
                 ff[i] = j;        // ফাইলকে এই block এ অ্যাসাইন করো
                frag[i] = temp;   // fragmentation হিসাব করো
                bf[j] = 1;        // block নেওয়া হয়ে গেছে চিহ্নিত করো
                break;            // আর পরের block দেখতে হবে না, লুপ থেকে বের হও
                }
            }
        }
    }    

    // শেষ পর্যন্ত allocation এর ফলাফল দেখানো হচ্ছে
    printf("\nFile_no \tFile_size \tBlock_no \tBlock_size \tFragment");
    for(i=1; i<=nf; i++)
        printf("\n%d\t\t%d\t\t%d\t\t%d\t\t%d", i, f[i], ff[i], b[ff[i]], frag[i]);

}
