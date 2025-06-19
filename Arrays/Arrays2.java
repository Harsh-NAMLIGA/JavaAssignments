public class Arrays2 {

    public static void main(String[] args)
    {
        int originalarray[]={1,2,1,2,2,3,3,4,5,5};
        int uniquearray[]=new int[originalarray.length];
        int uniquecount=0;

        for(int i=0;i< originalarray.length;i++)
        {
            boolean isduplicate=false;
            for(int j=0;j<uniquearray.length;j++)
            {
                if(originalarray[i]==uniquearray[j])
                {
                    isduplicate=true;
                    break;
                }
            }
            if(!isduplicate)
            {
                uniquearray[uniquecount]=originalarray[i];
            uniquecount++;
            }
        }
        System.out.println("Unique numbers: ");
        for(int i=0; i<uniquecount; i++)
        {
            System.out.print(uniquearray[i]+ " ");
        }
    }
}
