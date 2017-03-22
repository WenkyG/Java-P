class SquareRoot{
	static int squareRoot(int x){
		int start = 1,end = x, ans = 0, mid = 0;
		while(start <= end){
			mid = (start + end) / 2;
			if(x ==0 || x==1)
				return 1;
			if(mid*mid == x)
				return mid;
			if(mid*mid < x){
				start = mid + 1;
				ans = mid;
			} else{
				end = mid -1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		System.out.println(squareRoot(900));
	}
}