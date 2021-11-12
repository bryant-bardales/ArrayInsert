package InsertionSort;

class ArrayInsert
{
	private long[] a;                 // ref to array a
	private int nElems;               // number of data items
	//--------------------------------------------------------------
	public ArrayInsert(int max)          // constructor
	{
		a = new long[max];                 // create the array
		nElems = 0;                        // no items yet
	}
	//--------------------------------------------------------------
	public void insert(long value)    // put element into array
	{
		a[nElems] = value;             // insert it
		nElems++;                      // increment size
	}
	//--------------------------------------------------------------
	public void display()             // displays array contents
	{
		for(int j=0; j<nElems; j++)       // for each element,
			System.out.print(a[j] + " ");  // display it
		System.out.println("");
	}
	//--------------------------------------------------------------
	public void insertionSort()
	{
		int out, in;

		for(out=1; out<nElems; out++) {
			long temp = a[out];
			in = out;
			while(in>0 && a[in-1] >= temp)
			{
				a[in] = a[in-1];
				--in;
			}
			a[in] = temp;
		}
	}  // end bubbleSort()
	//--------------------------------------------------------------
	private void swap(int one, int two)
	{
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
	//--------------------------------------------------------------
}  // end class ArrayBub
