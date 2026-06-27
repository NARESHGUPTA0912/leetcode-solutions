class Solution {
    public boolean checkPerfectNumber(int n) {
        if(n<6)
			return false;
		int sum=1;
		int i=2;
		while(i*i<=n){
			if(n%i==0){
                int fact1=i;    int fact2=n/i;
                if(fact1!=fact2)
				    sum=sum+fact1+fact2;
                else
                    sum=sum+fact1;
            }
            i++;
        }
        return n==sum;   
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna