public class BM {
public static int BMmatch (String text, String pattern){
int[] last= buildLastFunction (pattern);
int n = text.length();
int m = pattern.length();
int i = m-1;
if (i>n-1)
return -1; //�� ���������, ���� ����� ������� ������
int j = m - 1;
do {
if (pattern.charAt(j) ==text.charAt(i))
if (j==0)
return i; //���������
else {
i - -;
j - -;
}
else{//��������� ��������
i = i+m - Math.min(j, 1+ last[text.charAt(i)]);
j=m-1;
}
}while (i<=n-1);
return -1 // �� ���������
}
public static int[] buildLastFunction (String pattern){
int[] last = new int[128] //��� ������� ������������ �������� ASCII
for (int i = 0; i<128; i++){
last [i] = -1; //�������������� ������
}
for (int i=0; i<pattern.length(); i++){
last[pattern.charAt(i)] = i;//�������� � ������������ � �������
//������� ASCII
}
return last
}
    public static void main(String[] args) {
     
    }
}