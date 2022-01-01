package Recursion;

public class towerHanio {
    public static void main(String[] args) {
        solve(3,'S','M','D');
    }
    public static void solve(int disks,char source, char middle, char destination){
        if (disks==0){
            System.out.println("Plate "+ disks+" from "+ source+" to "+ destination);
            return;
        }
        solve(disks - 1, source, destination, middle);
        System.out.println("Plate "+ disks+" from "+ source+" to "+ destination);
        solve(disks-1,middle,source,destination);
    }
}
