class FileDemo9 {
	public static void main(String args[]){
	try{
	File f = new File("data.txt");
	FileWriter fout = new BufferedWriter(fout);
	Scanner sc =new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    boolean flag=true;
    while(flag){
   
    System.out.print("Enter S.no.");
    bout.write(Integer.toString(sc.nextInt()));
    bout.write(" ");
     System.out.print("Enter Name");
    bout.write(sc.next());
    bout.write(" ");
    System.out.print("Enter CGPA");
    bout.write(sc.nextfloat());
    bout.write(" ");
    System.out.print("Enter Name");
    bout.write(sc.next().charAt(0));
    bout.newline();
    System.out.print("Do you want to continue entering data Y/N");
    char c= sc.next().charAt(0);
    if(c=='n' || c=='N'){
    flag=false;
		}
    }
    bout.close();
    Filereader fln = new Filereader(f);
    BufferedReader bin = new BufferedReader(fln);
    String sr;
    System.out.println("the contents of the files are");
    while(sr=bin.resultLine()!=null){
    String[] strs = sr.split(" ");
    System.out.print(strs[0]+ " "+strs[2]+ " "+strs[3]);
       }
    }
    catch(Exception e){
    e.printStackTrcae();
    }
    }
	}
