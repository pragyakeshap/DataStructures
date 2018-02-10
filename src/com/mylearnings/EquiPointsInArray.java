package com.mylearnings;

import java.util.Date;
import java.util.Random;


public class EquiPointsInArray {

    private int[] arr ;
    private long[][] equiPtsSums ;

    public static final int LEFT = 0 ;
    public static final int RIGHT = 1 ;

    EquiPointsInArray(int[] arr) {
        this.arr = arr;
        equiPtsSums = new long[this.arr.length][2] ;
    }

    void startProcess_v3()
    {
        long startmillis = new Date().getTime();

        long lhssum = 0 ;
        long rhssum = 0 ;
        System.out.println("==== VERSION 3 Gathering sums starting ....");
        boolean backIndexMeetsI = false ;
        boolean oddSizeArray = ((this.arr.length % 2) > 0);
        for (long i = 0 ; i < this.arr.length ; i++)
        {
            if (i == 0)
            {
                lhssum = 0 ;
                equiPtsSums[(int) i][LEFT] = lhssum ; // on the first elem (0) but since there are no elems to the left sum is zero

                lhssum = lhssum + this.arr[(int) i] ; // keep the sum ready for second elem (1)
            }
            else
            {
                equiPtsSums[(int) i][LEFT] = lhssum ; // fill in the second elem (1)
                lhssum = lhssum + this.arr[(int) i] ; // keep the sum ready for the third elem (2)
                                                      // the sum for the last elem will be discarded

            }
//            System.out.println("leftIndex =" + i + " value = " + this.arr[(int) i] + " running leftsum is " + lhssum);

            long backIndex = ((this.arr.length - 1) - i) ;
            if ( backIndex == (this.arr.length - 1) ) // should be the last element
            {
                rhssum = 0 ;
                equiPtsSums[(int) backIndex][RIGHT] = rhssum ; // you are on the last elem - so the sum to the right of that is nothing aka zero

                rhssum = rhssum + this.arr[(int) backIndex];   // keep this sum ready for when the pointer is on the second-last elem
            }
            else
            {
                equiPtsSums[(int) backIndex][RIGHT] = rhssum ; // fill the RHS sum for the second last elem
                rhssum = rhssum + this.arr[(int) backIndex];   // keep the third -last sum ready
                                                               // the sum for the first elem will be discarded
            }
            //          System.out.println("backIndex =" + backIndex + " value = " + this.arr[(int) backIndex] + " running rightsum is " + rhssum);
            //
            // it is imp. that the backIndex crosses over the frontIndex because when they are just one apart they have not yet written their values this is for EVEN sized array
            if ( ((backIndex == i && oddSizeArray) || ( (backIndex - i == -1) && !oddSizeArray)) && backIndexMeetsI == false)
            {
                if (oddSizeArray)
                {
                    System.out.print("\nOdd Size Array backIndex=" + backIndex + " frontIndex=" + i);
                }
                else
                {
                    System.out.print("\nEven Size Array backIndex=" + backIndex + " frontIndex=" + i ) ;
                }

                backIndexMeetsI = true ;
                System.out.println("Now we can start checking for equality ....");
            }
            if (backIndexMeetsI)
            {
                long lftSumShdHaveBeendone = equiPtsSums[(int) backIndex][LEFT] ;
                long rgtSumShdHaveBeendone = equiPtsSums[(int) backIndex][RIGHT] ;
                System.out.print("\nlhssum = " + lftSumShdHaveBeendone);
                System.out.print("\tinputArray[" + backIndex + "] =\t");
                System.out.print(this.arr[(int) backIndex]);
                System.out.print("\t rhssum = " + rgtSumShdHaveBeendone);

                if (lftSumShdHaveBeendone == rgtSumShdHaveBeendone)
                {
                   if (this.isThisDefinedEquiPoint((int) backIndex)) {
                       System.out.print(" VALID EQUI-POINT");
                   } else {
                       //System.out.print("");
                   }
                }

                long lftSumShdHaveBeendoneI = equiPtsSums[(int) i][LEFT] ;
                long rgtSumShdHaveBeendoneI = equiPtsSums[(int) i][RIGHT] ;
                System.out.print("\nlhssum = " + lftSumShdHaveBeendoneI);
                System.out.print("\tinputArray[" + i + "] =\t");
                System.out.print(this.arr[(int) i]);
                System.out.print("\t rhssum = " + rgtSumShdHaveBeendoneI);

                if (lftSumShdHaveBeendoneI == rgtSumShdHaveBeendoneI)
                {
                    if (this.isThisDefinedEquiPoint((int) backIndex)) {
                        System.out.print(" VALID EQUI-POINT");
                    } else {
                        //System.out.print("");
                    }
                }


            }
        }
        System.out.println("\nGathering sums finished");
        System.out.println("equi-points process finished");
        long endmillis = new Date().getTime() ;
        long timetaken = endmillis - startmillis ;
        System.out.println(timetaken + " ms");


    }

    void startProcess_v2()
    {
        long startmillis = new Date().getTime();

        long lhssum = 0 ;
        long rhssum = 0 ;
        System.out.println("====VERSION 2 Gathering sums starting ....");
        for (long i = 0 ; i < this.arr.length ; i++)
        {
            lhssum = lhssum + this.arr[(int)i] ;
            equiPtsSums[(int) i][LEFT] = lhssum ;
            System.out.println("leftIndex =" + i + " value = " + this.arr[(int) i] + " running leftsum is " + lhssum);

            long backIndex = ((this.arr.length - 1) - i) ;
            rhssum = rhssum + this.arr[(int) backIndex];
            equiPtsSums[(int) backIndex][RIGHT] = rhssum ;
            System.out.println("backIndex =" + backIndex + " value = " + this.arr[(int) backIndex] + " running rightsum is " + rhssum);
        }
        System.out.println("Gathering sums finished");

        System.out.println("finding equi-points sums started ...");
        for (long i = 0 ; i < this.arr.length ; i++) {
            lhssum = equiPtsSums[(int) i][LEFT];
            rhssum = equiPtsSums[(int) i][RIGHT];

            System.out.print("lhssum = " + lhssum);
            System.out.print("\tinputArray[" + i + "] =\t");
            System.out.print(this.arr[(int) i]);
            System.out.print("\t rhssum = " + rhssum);

            if (lhssum == rhssum) {
                System.out.print(" lhssum == rhssum ");
                if (this.isThisDefinedEquiPoint((int) i)) {
                    System.out.print(" VALID EQUI-POINT");
                } else {
                    //System.out.print("");
                }
            }
            System.out.print("\n");
        }
        System.out.println("equi-points process finished");
        long endmillis = new Date().getTime() ;
        long timetaken = endmillis - startmillis ;
        System.out.println(timetaken + " ms");

    }

    void startProcess()
    {
        System.out.println("===== VERSION ZERO");
        long startmillis = new Date().getTime();
        for (long i = 0 ; i < this.arr.length ; i++)
        {
            // lhs sum
            long lhssum = 0 ;
            long j = 0 ;
            for ( ; j < i; j++)
            {
                lhssum = lhssum + this.arr[(int)j] ;

            }

            // rhs sum
            long rhssum = 0 ;
            for (long k = i + 1 ; k < this.arr.length ; k++ )
            {
                rhssum = rhssum + this.arr[(int)k] ;
            }

            System.out.print("lhssum = " + lhssum);
            System.out.print("\tinputArray[" + i + "] =\t");
            System.out.print(this.arr[(int)i]);
            System.out.print("\t rhssum = " + rhssum);

            if (lhssum == rhssum)
            {
                System.out.print(" lhssum == rhssum ");
                if (this.isThisDefinedEquiPoint((int)i))
                {
                    System.out.print(" VALID EQUI-POINT");
                }
                else
                {
                    //System.out.print("");
                }
            }
            System.out.print("\n");
        }
        long endmillis = new Date().getTime() ;
        long timetaken = endmillis - startmillis ;
        System.out.println(timetaken + " ms");
    }

    /**
     * 
     *    N is {@link codility.demo.EquiPointsInArray#arr The Holding int Array for your list of numbers} the length of the array for which we need to find these equi-points, Pos here refers to possible equi-points within the array
     * 
     *
     * What the original problem description from codility does not make simply clear is that an equi-point value in the array is not involved in the lhs sum or the rhs sum</strong>
     *
     * @param pos
     * @return true or false whether this is a valid equi-point to check
     */
    boolean isThisDefinedEquiPoint(int pos)
    {

        return (pos >= 0) && (pos < this.arr.length) ;
    }

    int[] createTestArray(int size) throws Exception
    {
        int[] tmp = new int[size] ;
        if (size >= 0 && size <= 100000)
        {
            Random randGen = new Random();


            for (int l=0 ; l < size; l++)
            {
                //tmp[l] = randGen.nextInt() ;
                tmp[1] = randGen.nextInt(5);
            }

            return tmp ;

        }
        else
        {
            throw new Exception("Size of array is defined as N is an integer within the range [0..100,000]' ");
        }
    }


    public static void main(String...args) throws Exception
    {
        EquiPointsInArray e = new EquiPointsInArray(new int[]{-1,3,-4, 5 ,1,-6 ,2, 1,0} );
        e.startProcess_v2();
        e.startProcess_v3();

//        e = new EquiPointsInArray( e.createTestArray(100000) );
//        //e.startProcess();
//        //e.startProcess_v2();
//        e.startProcess_v3();


        e = new EquiPointsInArray(new int[]{-1,3,-4, 5 ,1,-6 ,2, 1} );
        //e.startProcess();
        //e.startProcess_v2();
        e.startProcess_v3();


        e = new EquiPointsInArray(new int[]{1,-1,3,-4, 5 ,1,-6 ,2, 1,-6789098,-1,3,-4, 5 ,1,-6 ,2, 1,1} );
        //e.startProcess();
        //e.startProcess_v2();
        e.startProcess_v3();

        e = new EquiPointsInArray(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0});
        //e.startProcess();
        //e.startProcess_v2();
        e.startProcess_v3();



//        e = new EquiPointsInArray( e.createTestArray(1000) );
//        e.startProcess();
//        //e.startProcess_v2();
//        e.startProcess_v3();

    }
}
