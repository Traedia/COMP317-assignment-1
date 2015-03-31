public class minHeap{
    
    private String[] array_;
    
    public minHeap(int size){
	array_ = new String[size];
	array_[0] = Integer.toString(0);
    }

    public void add(String s) throws NumberFormatException{
	// Increment array_[0] (count of elements)
	int count = Integer.parseInt(array_[0]);
	count++;
	if(count > array_.length)
	    return;
	array_[0] = Integer.toString(count);

	// Add new item to end of minheap
        array_[count] = s;
	
	// While value of new node is less than the value of parent
	while(array_[count].compareTo(array_[count/2]) < 0 && count > 1){
	    // Swap the two nodes
	    swap(count, count/2);
	    // Go up to parent
	    count/=2;
	}

    }
    
    private void swap(int a, int b){
	String temp;
	temp = array_[a];
	array_[a] = array_[b];
	array_[b] = temp;
    }

    public String get(int a) throws NumberFormatException{

	// Return null String if no elements in array
	if(array_[0] == "0")
	    return null;

	// Swap first and last element
	int count = Integer.parseInt(array_[0]);
	swap(1, count);

	// Store value of String to be retrieved 
	String s = array_[count];
	
	// Decrement min-heap
	count--;                // count is used later on. 
	array_[0] = Integer.toString(count);

	downheap(count);
	return s;
    }

    public String replace(String s, boolean write){
	if(array_[0]== "0")
	    return null;
	
	String root = array_[1];
	array_[1] = s;
	int count = Integer.parseInt(array_[0]);
	
	if(write)
	    downheap(count);
	else{
	    swap(1, count);
	    array_[0] = Integer.toString(count--);
	}

	return root;
    }

    private void downheap(int count) {
	int i = 1;
	// While node is larger than it's child swap and set i to child index
	while(i < count && (array_[i].compareTo(array_[2*i]) > 0 || array_[i].compareTo(array_[2*i+1]) > 0)){
	    if(array_[2*i].compareTo(array_[2*i+1]) <= 0){
		swap(i, 2*i);
		i = 2*i;
	    }
	    else{
		swap(i, 2*i+1);
		i = 2*i+1;
	    }
	}
    }
}
