package morgan;

public class BuildingFacingSun {

	public static void main(String[] args) {
	    int building[]=new int[] {7,4,8,2,9};
	    int len=building.length;
	    int count=1;
	    for(int i=1;i<len;i++)
	    {
	    	if(building[i-1]<building[i])
	    		count++;
	    }
	    System.out.println("no of building facing sun "+count);
	}

}
