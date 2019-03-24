package com.color;


public class BallsStraightLine {
    static int A=3, B=1, C=2, D=0;
    static int count=0;
	static int f(int i,int prev, int Ai, int Bi, int Ci, int Di ){
		
		int fA = 0, fB = 0, fC = 0, fD = 0;
		
		if(prev!='A'){
			if(A-Ai>0)	{		
				System.out.print(" A "+"("+i+")");
				f(i+1,'A',Ai+1,Bi,Ci,Di);
				fA =  1;
				//System.out.println("fA: "+fA);
				//System.out.println();
			}
			else {
				fA=0;
				//
			}
		}
		
		if(prev!='B'){
			if(B-Bi>0)	{		
				System.out.print(" B "+"("+i+")");
				f(i+1,'B',Ai,Bi+1,Ci,Di);
				fB =  1;
				//System.out.println("fB: "+fB);
				//System.out.println();
			}
			else {
				fB=0;
			}
		}
		
		if(prev!='C'){
			if(C-Ci>0){			
				System.out.print(" C "+"("+i+")");
				 f(i+1,'C',Ai,Bi,Ci+1,Di);
				fC =  1;
				//System.out.println("fC: "+ fC);
				//System.out.println();
			}
			else {
				fC=0;
			}
			
		}
		
		if(prev!='D'){
			if(D-Di>0){			
				System.out.print(" D "+"("+i+")");
				f(i+1,'D',Ai,Bi,Ci,Di+1);
				fD =  1;
				//System.out.println("fD: "+fD);
				//System.out.println();
			}
			else {
				fD=0;
			}

		}
		
		
		int fi = fA + fB + fC + fD;
		if(fi==0 ) {
			System.out.println();		
			count++;
		    //System.out.print("i: "+i);
		}
		return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println("Count: "+ f(1,'0',0,0,0,0));
        
       
	}

}
