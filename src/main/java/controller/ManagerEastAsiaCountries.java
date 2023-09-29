/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package controller;

import Model.Text;
import view.Menu;

/**
 *
 * @author HP
 */
public class ManagerEastAsiaCountries extends Menu<String>{
    private Text list= new Text();
    public ManagerEastAsiaCountries(String title, String[] s){
        super(title, s);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                list.inputCountry();
                break;
            case 2:
                list.printCountry();
                break;
            case 3:
                list.searchByName();
                break;
            case 4:
                list.printCountrySorted();
                break;
            case 5:
                System.exit(0);        
        }
    }
}
