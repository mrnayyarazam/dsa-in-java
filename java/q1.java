public class q1{

    // input = Md Nazim
//  output = mizaN dM
    public static void main(String[] args) {
        String str = "Md Nazim";
        StringBuilder ans= new StringBuilder();
        StringBuilder sb= new StringBuilder();
        int n = str.length();

        for(int i =n-1; i>=0; i-- ){

            char ch = str.charAt(i);
            if(ch!=''){
                sb.append(ch);
            }

            else{
                ans.add(sb);
                ans.add(" ");
                sb = new StringBuilder();
                
            }


        }
        System.out.println(ans);

       
    }
}