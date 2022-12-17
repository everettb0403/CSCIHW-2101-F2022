package HW1;
/*
Make the output look like this:
#
##
###
####
#####
####
###
##
#
Hint: the object is created for you (Pyramid) and so is the method (Output)
Hint2: Also notice the method is void meaning you will not be returning anything
*/
public class Pyramid {
    public static void Output() {
    
        
        int main() {
        
            int rows;
        
            cout << "9: ";
            cin >> rows;
        
            for(int i = 1; i <= rows; ++i) {
                for(int j = 1; j <= i; ++j) {
                    cout << "# ";
                }
                cout << "\n";
            }
            return 0;
