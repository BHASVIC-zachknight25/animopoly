import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 700, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Space Space1 = new Space(1);
        addObject(Space1,50,650);
        Space Space2 = new Space(2);
        addObject(Space2,50,550);
        Space Space3 = new Space(3);
        addObject(Space3,50,450);
        Space Space4 = new Space(4);
        addObject(Space4,50,350);
        Space Space5 = new Space(5);
        addObject(Space5,50,250);
        Space Space6 = new Space(6);
        addObject(Space6,50,150);
        Space Space7 = new Space(7);
        addObject(Space7,50,50);
        Space Space8 = new Space(8);
        addObject(Space8,150,50);
        Space Space9 = new Space(9);
        addObject(Space9,250,50);
        Space Space10 = new Space(10);
        addObject(Space10,350,50);
        Space Space11 = new Space(11);
        addObject(Space11,450,50);
        Space Space12 = new Space(12);
        addObject(Space12,550,50);
        Space Space13 = new Space(13);
        addObject(Space13,650,50);
        Space Space14 = new Space(14);
        addObject(Space14,750,50);
        Space Space15 = new Space(15);
        addObject(Space15,750,150);
        Space Space16 = new Space(16);
        addObject(Space16,750,250);
        Space Space17 = new Space(17);
        addObject(Space17,750,350);
        Space Space18 = new Space(18);
        addObject(Space18,750,450);
        Space Space19 = new Space(19);
        addObject(Space19,750,550);
        Space Space20 = new Space(20);
        addObject(Space20,750,650);
        Space Space21 = new Space(21);
        addObject(Space21,650,650);
        Space Space22 = new Space(22);
        addObject(Space22,550,650);
        Space Space23 = new Space(23);
        addObject(Space23,450,650);
        Space Space24 = new Space(24);
        addObject(Space24,350,650);
        Space Space25 = new Space(25);
        addObject(Space25,250,650);
        Space Space26 = new Space(26);
        addObject(Space26,250,650);
        Space Space27 = new Space(27);
        addObject(Space27,150,650);
        Textbox text1 = new Textbox("1");
        addObject(text1,10,618);
         Textbox text2 = new Textbox("2");
        addObject(text2,10,518);
         Textbox text3 = new Textbox("3");
        addObject(text3,10,418);
         Textbox text4 = new Textbox("4");
        addObject(text4,10,318);
         Textbox text5 = new Textbox("5");
        addObject(text5,10,218);
         Textbox text6 = new Textbox("6");
        addObject(text6,10,118);
         Textbox text7 = new Textbox("7");
        addObject(text7,10,18);
         Textbox text8 = new Textbox("8");
        addObject(text8,110,18);
         Textbox text9 = new Textbox("9");
        addObject(text9,210,18);
         Textbox text10 = new Textbox("10");
        addObject(text10,315,18);
         Textbox text11 = new Textbox("11");
        addObject(text11,415,18);
         Textbox text12 = new Textbox("12");
        addObject(text12,515,18);
         Textbox text13 = new Textbox("13");
        addObject(text13,615,18);
         Textbox text14 = new Textbox("14");
        addObject(text14,715,18);
        Textbox text15 = new Textbox("15");
        addObject(text15,715,118);
        Textbox text16 = new Textbox("16");
        addObject(text16,715,218);
        Textbox text17 = new Textbox("17");
        addObject(text17,715,318);
        Textbox text18 = new Textbox("18");
        addObject(text18,715,418);
        Textbox text19 = new Textbox("19");
        addObject(text19,715,518);
        Textbox text20 = new Textbox("20");
        addObject(text20,715,618);
        Textbox text21 = new Textbox("21");
        addObject(text21,615,618);
        Textbox text22 = new Textbox("22");
        addObject(text22,515,618);
        Textbox text23 = new Textbox("23");
        addObject(text23,415,618);
        Textbox text24 = new Textbox("24");
        addObject(text24,315,618);
        Textbox text25 = new Textbox("25");
        addObject(text25,215,618);
        Textbox text26 = new Textbox("26");
        addObject(text26,115,618);
        Textbox start = new Textbox("START");
        addObject(start,50,650);
        Textbox miss = new Textbox("miss turn");
        addObject(miss,750,50);
    }
    
}
