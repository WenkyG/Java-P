class QuickSort {
	public static int quicKSort(int a[],int start, int end){
		int pivote = end;
		int tracker = start;
		for(int i= start; i<end;i++){
			if(a[i] < a[pivote]){
				int temp = a[tracker];
				a[tracker] = a[i];
				a[i] = temp;
				tracker++;
			}
		}
		int t = a[pivote];
		a[pivote] = a[tracker];
		a[tracker] = t;
		return tracker;
	}

	public static void sort(int a[], int start, int end){
		if(start < end){
			int index = quicKSort(a,start,end);
			sort(a,start,index-1);
			sort(a,index+1,end);
		}
	}

	public void printA(int a[]){
		for(int i = 0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		int a[] = {11,2,31,4,5,16,7};
		QuickSort obj = new QuickSort();
		obj.sort(a,0,a.length-1);
		obj.printA(a);
	}
}