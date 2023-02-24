class qb6{
	public static void main(String args[]){
		System.out.println("");
		int arr[] = {1,6,8,4,9,7,2,5,3,45};
		for(int i= 0;i<10;i++){
			for(int j = 1;j<10 ;j++){
				if(arr[j-1]<arr[j]){
					int t = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = t;
				}
			}
		}

		for(int i = 0;i<10;i++){
			System.out.println(" "+arr[i]);
		}

}}