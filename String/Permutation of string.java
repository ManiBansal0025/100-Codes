public class Main
{
public static void main(String[] args) {
String str = "eye";int count=1;int p=1;
char ch[] = str.toCharArray();
for(int i=0;i<str.length();i++){
   for(int j=i+1;j<str.length();j++){
       if(ch[i] == ch[j]){
           p++;
           //System.out.println(p);
           break;
       }
   }
}
int div =0;int mul=1;
if(p == 1){
   for(int i=1;i<=str.length();i++){
       count = count*i;
   }
}
else{
 for(int i=1;i<=str.length();i++){
   count = count*i;
}
for(int i=1;i<=p;i++){
    mul = mul*i;
    //System.out.println(mul);
   
}
// System.out.println(p);
div = count/mul;
}
if(p==1){
   System.out.println(count);
}
else{
   System.out.println(div);
}
}
}
