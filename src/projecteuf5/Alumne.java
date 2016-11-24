/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuf5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author manel
 */
public class Alumne {
    static final String FITXER = "alumnes.dat";
    static final String NOM="Manel";
    static final String COGNOMS="Gavaldà Andreu";
 //   static final Date DATANAIXEMENT;
    public String email;
    public List moduls = new ArrayList();
    
        public static void main(String[] args) 
        throws IOException, ClassNotFoundException {

 
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new
                    BufferedOutputStream(new FileOutputStream(FITXER)));

            out.writeObject(Calendar.getInstance());
//            for (int i = 0; i < prices.length; i ++) {
//                out.writeObject(prices[i]);
//                out.writeInt(units[i]);
//                out.writeUTF(descs[i]);
//            }
        } finally {
            if(out!=null) out.close();
        }

        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new
                    BufferedInputStream(new FileInputStream(FITXER)));

            Calendar date = null;
            BigDecimal price;
            int unit;
            String desc;
            BigDecimal total = new BigDecimal(0);

            date = (Calendar) in.readObject();

            System.out.format ("On %tA, %<tB %<te, %<tY:%n", date);

            try {
                while (true) {
                    price = (BigDecimal) in.readObject();
                    unit = in.readInt();
                    desc = in.readUTF();
                    System.out.format("You ordered %d units of %s at $%.2f%n",
                            unit, desc, price);
                    total = total.add(price.multiply(new BigDecimal(unit)));
                }
            } catch (EOFException e) {}
            System.out.format("For a TOTAL of: $%.2f%n", total);
        } finally {
            if(in!=null) in.close();
        }
    }
}
