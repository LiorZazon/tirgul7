package com.company;

import java.time.LocalDateTime;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //targil 1:

        LocalDateTime myDate = LocalDateTime.of(1992, 07, 02, 0, 0);
        System.out.println(myDate);

        //targil 2:

        //comparable - אינטרפייס שמשתמשים בו באותה המחלקה, וחייבים לממש ת פונקציית הקומפר טו שלו על מנת למיין לפי איזשהו קריטריון
        //שיהיה קריטריון ברירת מחדל עליו נחליט בין אם זה לפי ת.ז או שם.
        //הפונקציה תיקח 2 אלמנטים תשווה בינהם ותראה מי עומד ראשון וכך תדע למיין את הרשימה

        //comparator - כאשר אנו רוצים רוצים לשמור על יותר מאסטרטגיית מיון אחת נשתמש באינטרפייס הזה, ניצור מחלקה שונה שמטרתה
        //לספק אסטרטגיות מיון ונסביר לאותהנ מחלקה איך למיין ולפי מה

        //בדרכ המחלקה עצמה נחזיק את אסטרטגיית המיון ברירת המחדל, ונחזיק עוד מחלקות עם אסטרטגיות מיון נוספות

        //targil 3:

        ArrayList<Continent> continents = new ArrayList<>();
        continents.add(new Continent("Asia", 44580000, 4));
        //מיליארד+
        continents.add(new Continent("Europe", 10180000, 746));
        // מליון
        continents.add(new Continent("Africa", 30370000, 1));
        //מליארד
        System.out.println("==============before sort============");
        for (int index = 0; index < continents.size(); index++) {
            System.out.println(continents.get(index));
        }
        Collections.sort(continents);

        //targil 4:

        System.out.println("============================");
        System.out.println("sort by Size");


        for (int index = 0; index < continents.size(); index++)
        {
            System.out.println(continents.get(index));
        }
        Collections.sort(continents, new ContinentCompareBySize());


        System.out.println("=======================");
        System.out.println("sort By Population");
        for (int index = 0; index < continents.size(); index++)
        {
            System.out.println(continents.get(index));
        }
        Collections.sort(continents, new ContinentCompareByPopulation());

        //targil 5:

        //ContinentCompareBySizeAndPopulation
        System.out.println("==============================");
        System.out.println("sort by size first only if equal sort by population");
        for (int index = 0; index < continents.size(); index++)
        {
            System.out.println(continents.get(index));
        }
        Collections.sort(continents, new ContinentCompareBySizeAndPopulation());

        //targil 6:

        //1. from Object class
        //2. clone(), equals(Object obj), finalize(), getClass(), hashCode(),notify(), 	notifyAll(), 	toString()
        //wait().

        //targil 7:

        //Lists - ArrayList, Vector, Stack
        //Queue , Deque
        //Set , HasMap

        //targil 8:

        //<> - called Generics
        //no, you can't, because its a primitive type

        //targil 9:
        //מחזיקי מידע פרימיטיבים לא יכולים לרשת ממחלקת number / object אי אפשר להתייחס אליהם כאובייקטים
        //עשו זאת על מנת לחסוך ולשפר ביצועים

        //targil 10:
        //stack- כמו מחסנית אפשר להוסיף איבר אך רק מהכי למעלה ולהוציא רק מהכי למעלה
        //Queue- כמו תור שכל פעם בא מישהו ועומד בסוף התור וכשיש קבלת קהל הראשון בתור מתקבל ויוצא/נמחק

        //targil 11:

        Stack<String> stacks = new Stack<>();
        stacks.push("why");
        stacks.push("where");
        stacks.push("who");

        for (String item : stacks) {
            System.out.println(item);
        }
        String item = stacks.pop();
        System.out.println(item);

        System.out.println(stacks.peek());

        // pop - מוציא את האיבר האחרון ברשימה החוצה
        // peek - מציף אל האיבר אך לא נוגע בו לא מוציא אותו, לא גורם לשינוי ברשימה

        Queue<Double> people_line = new ArrayDeque<>();
        people_line.add(6.2);
        people_line.add(5.2);
        people_line.add(9.2);
        for (Double d: people_line) {
            System.out.println(d);
        }
        Double d = people_line.poll();
        System.out.println(d);
        System.out.println(people_line.peek());

        people_line.removeAll(people_line);

        //targil 13:

        //in process and not going well

        //targil 14:

        // אוסף של נתונים שאי אפשר לשנות אותם כלומר מייצר איזושהיא רשימה שאין אפשרות להוסיף לה את אותו האיבר פעמיים.

        //targil 15:

        //HashMap - מבנה נתונים שנותן לאחסן מידע בתוכו באמצעות מפתח  וברגע שנותנים לו מפתח ניתן להוציא /למצוא איברים
        //מאוד מאוד מהר מכל רשימה ממערכת אחרת שקיימת.

        //targil 16:


        //targil 17:

        //Generics- חוסך לנו לכתוב מחלקה נפרדת לכל סוג  ברגע שאנו מכריזים על הסוג ומפעילים את הפונקציה אנו חייבים לתת
        //איבר מאותו סוג וכך הוא יחזיר לנו את האיבר מאותו סוג שהכרזנו עליו
        //כאשר הופכים מחלקה לגנרית ומכניסים T/E באיזור הטייפ של הרישמה כל המקומות שקשורים לרשימה  צריכים להיות עם T/E אחרת תהיה שגיאת קומפילציה

        //targil 18:

        //i think i did it wrong, tried my best

        //targil 19:

        //מצב שבו התוכנית מגיעה לשורת קוד שאין לה איך להתמודד איתה - חריגה

        //אקסםשיין שיכול לקרות, כאשר מחלקים ב-0

        //targil 20:

        //יש פקודה ב-java שנקראת try שאומרת לjava נסה להריץ את הקוד שלפניך, יש מצב שתנסה להתרסק, ותצטרך שמישהו
        //יתפוס אותך, אל תדאג אני אתפוס אותך, אחרי try נוסיף  catch
        //כלומר java יראה לנו איפה התחילה הנפילה ותמיד יחפש בקוד הבא אם יש קוד שתופס אותו מלקרוס ואנו נעשה זאת בעזרת הפקודות try ו -  catch

        //targil 21:

        int a = 5;
        int b = 0;


        try {
            divideByZero(a, b);
            System.out.println("hello");

        }
        catch (Exception e)
        {
            System.out.println("Oops");
        }

        //targil 22:

        //סוג מסויים של אפליקציית שירות המאפשרת לי לשמור מידע בצורה נוחה מאוד וגם לשלוף אותו בצורה נוחה, זהו בסיס מידע טבלאי
        //שבו נייצר טבלה שבתוכה סכמה ובאותה סכמה יהיו כמה שדות בשביל לעבוד עם בסיס הנתונים נשתמש בשפת SQL

        //targil 23 + 24:

        /*CREATE TABLE PRODUCTS(
         ID INT PRIMARY KEY NOT NULL,
         NAME TEXT NOT NULL,
         PRICE REAL
         );
         INSERT INTO PRODUCTS (ID,NAME,PRICE)
         VALUES (4, 'MAAYAN', 65000.00 );
         INSERT INTO PRODUCTS (ID,NAME,PRICE)
         VALUES (5, 'LIOR', 25000.00 );
         SELECT* FROM PRODUCTS;
         DELETE FROM PRODUCTS WHERE ID = 4;
         UPDATE PRODUCTS SET PRICE = 90 WHERE ID = 5;
         */

    }

    //21
    public static void divideByZero(int a, int b)
    {
        int c = a / b;
    }
}
