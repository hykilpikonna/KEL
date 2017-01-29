/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.moecraft.kelores.Convertion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kilpikonna
 */
public class stringConversion {
    public static String convertName(String reg)
    {
        return reg.replace('&', '§');
    }
    
    public static ArrayList<String> convertName(ArrayList<String> reg)
    {
        ArrayList<String> output = new ArrayList<>();
        for (int i = 0; i < reg.size(); i++)
        {
            output.add(reg.get(i).replace('&', '§'));
        }
        return output;
    }
    
    public static ArrayList<String> convertName(List<String> reg)
    {
        ArrayList<String> output = new ArrayList<>();
        for (int i = 0; i < reg.size(); i++)
        {
            output.add(reg.get(i).replace('&', '§'));
        }
        return output;
    }
}
