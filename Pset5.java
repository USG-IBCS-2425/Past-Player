import java.util.*;

class ChompBistro{
	/*String[] employees = new String[5];
	String[] possibleMenu = new String[];
	int dayOfWeek;*/

	String[] employees;
	String[] possibleMenu;
	int dayOfWeek;

	public ChompBistro(String[] inputEmployees, String[] menuItems){
		employees = inputEmployees;
		possibleMenu = menuItems;
	}
	public String getEmployees(){
		String emp = "";
		for(int i=0; i<employees.length; i++){
			if(i==employees.length){
				emp = emp + employees[i];
			}else{
				emp = emp + employees[i] + ", ";
			}
		}
		return emp;
	}
	public String getMenuItems(){
		String menu = "";

		for(int i=0; i<possibleMenu.length; i++){
			if(i==possibleMenu.length){
				menu = menu + possibleMenu[i];
			}else{
				menu = menu + possibleMenu[i] + ", ";
			}
		}
		return menu;
	}
	public int getDay(){
		return dayOfWeek;
	}
	public void setDay(){
		if (day >= 1 && day <= 5) {
			dayOfWeek = day;
    	}
	}

	public String gnerateMenu(){
		String randomMenu = "";
		for (int i = 0; i < 3; i++){
			int pos = (int)(Math.random()*possibleMenu.length);
			randomMenu = randomMenu + possibleMenu[pos] + ", ";
		}
		return randomMenu;

	}

	public String whoWorking(){
		
	}


	public static void main(String[] args) {
		ChompBistro bistro = new ChompBistro();
		String[] inputEmployees = {"Alice", "Bob", "Charlie", "David", "Eve"};
        String[] menuItems = {"Burger", "Salad", "Pasta", "Pizza", "Sushi"};

        Scanner s = new Scanner(System.in);
        String choice = s.nextLine();
        if(choice == "menu"){
        	bistro.getMenuItems();
        }

	}
}