
public class CheckWhoWinsElection {

	public static int CheckWhoWinsElection(int A[], int n) {
		int currentCandidate=A[0];
		int maxCandidate=A[0];
		int currentCounter=0,maxCounter=0;int maxi=0;
		int theMaxCandidate = 0;
		
		for(int i=0;i<n;i++){
			if(A[i]==currentCandidate){
				currentCounter++;
			}
			else{
				currentCandidate=A[i];
				currentCounter=1;
			}
			
			if(maxi<currentCounter){
				maxCounter=currentCounter;
				theMaxCandidate=currentCandidate;
				maxi=maxCounter;
			}
			else{
				maxCounter=currentCounter;
				maxCandidate=currentCandidate;
			}
		}
		return theMaxCandidate;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int A[]={2,2,2,4,4,3,3,3,3,3,3,3,3,3,3};
	     
		int n=A.length;
		int resultcanditate = CheckWhoWinsElection(A,n);
		System.out.println(resultcanditate);

	}

}
