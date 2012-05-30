public class BM {
public static int BMmatch (String text, String pattern){
int[] last= buildLastFunction (pattern);
int n = text.length();
int m = pattern.length();
int i = m-1;
if (i>n-1)
return -1; //не совпадает, если шабло длиннее текста
int j = m - 1;
do {
if (pattern.charAt(j) ==text.charAt(i))
if (j==0)
return i; //совпадает
else {
i - -;
j - -;
}
else{//эвристика пропуска
i = i+m - Math.min(j, 1+ last[text.charAt(i)]);
j=m-1;
}
}while (i<=n-1);
return -1 // не совпадает
}
public static int[] buildLastFunction (String pattern){
int[] last = new int[128] //при условии испоьзования символов ASCII
for (int i = 0; i<128; i++){
last [i] = -1; //инициализирует массив
}
for (int i=0; i<pattern.length(); i++){
last[pattern.charAt(i)] = i;//приводит в соответствие с числами
//таблицы ASCII
}
return last
}
    public static void main(String[] args) {
     
    }
}