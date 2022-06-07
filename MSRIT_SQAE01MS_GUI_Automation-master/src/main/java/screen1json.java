import java.io.File;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import org.json.*;
import java.lang.*;
//import org.json.JSONArray;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Srishti
 */
public class screen1json {
    



	public static List<String> compareWith(String n) throws Exception
	{
	File directory=new File("file/");
    int fileCount=directory.list().length;
    System.out.print("File Count:"+fileCount);
            // parsing file "JSONExample.json"
List<String> result=new ArrayList<>();
boolean found=false;
 int filename=1;
JSONObject  gname=new JSONObject();
while(filename<=fileCount){	
                Object obj = new JSONParser().parse(new FileReader(".\\file\\"+filename+".json"));

                                // typecasting obj to JSONObject
                                JSONObject jo = (JSONObject) obj;

                                Object layers1=jo.get("layers");

                //String demo1=layers1.toString();
                //demo1.trim();
                JSONArray jo2=new JSONArray ();





                jo2=(JSONArray)layers1;
                JSONArray l=(JSONArray) jo.get("layers");
                JSONObject obj3=new JSONObject();
                //System.out.println("\njsonarray l \n"+l.toString().trim()+"\n\n");
                Iterator<JSONObject> iterator = jo2.iterator();
                                        while (iterator.hasNext()) {
                                                //System.out.println(iterator.next());
                 obj3=iterator.next();
                                        }

                Object object=obj3.get("layers");
                //System.out.println("\n object \n"+object.toString().trim()+"\n\n");

                JSONArray l2=(JSONArray) object;

                //System.out.println("\nlayers2\n"+l2.toString().trim()+"\n\n");
                int i=0;
                Iterator<JSONObject> it = l2.iterator();
                //System.out.println("iterator created");
                
                for( i=0;i<l2.size();i++){
                            Object o1=it.next();
                            gname=(JSONObject)o1;
                            Object name=gname.get("name");
                            //System.out.println("element:"+i+" name:"+name.toString().trim()+"\n");
                            if(name.toString().equals(n)){found=true;break;}
                }

if(found)break;
filename++;
}

if(found==false){
    System.out.println("not found");
//    return result;
}
Object frameobj=gname.get("frame");
JSONObject fobj=(JSONObject)frameobj;

Object style=gname.get("style");
JSONObject styleobj=(JSONObject) style;
Object border=styleobj.get("borderOptions");
JSONObject borderOptions=(JSONObject)border;

result.add("name: "+gname.get("name").toString());
result.add("isVisible:"+gname.get("isVisible"));
result.add("x: "+fobj.get("x").toString());
result.add("y: "+fobj.get("y").toString());
result.add("height: "+fobj.get("height").toString());
result.add("width: "+fobj.get("width").toString());
result.add("isEnabled: "+borderOptions.get("isEnabled").toString());

//result.add(gname.get("name").toString());
//result.add(""+gname.get("isVisible"));
//result.add(fobj.get("x").toString());
//result.add(fobj.get("y").toString());
//result.add(fobj.get("height").toString());
//result.add(fobj.get("width").toString());
//result.add(borderOptions.get("isEnabled").toString());

Object cl=gname.get("_class");







if(cl.toString().equals("bitmap")||cl.toString().equals("rectangle")||cl.toString().equals("oval"))
{
 Object attrstring=gname.get("style");
JSONObject atrstr=(JSONObject)attrstring;
Object atr1=atrstr.get("fills");
//System.out.println(atr1+"\n\n");
JSONArray a1=(JSONArray)atr1;
Iterator<JSONObject> colorss = a1.iterator();
//System.out.println("itr created");
int k=0;
Object atr2=new Object();
if(!a1.isEmpty()){
for(k=0;k<a1.size();k++)
    atr2=colorss.next();
JSONObject c=(JSONObject)atr2;

JSONObject a2=(JSONObject)atr2;
Object attri=a2.get("color");
//System.out.println("\n\n"+attri);
a2=(JSONObject)attri;

//Object mSSa=a2.get("MSAttributedStringColorAttribute");
//JSONObject msa=(JSONObject)mSSa;
result.add(a2.get("red").toString());
result.add(a2.get("blue").toString());
result.add(a2.get("green").toString());}
//result.add("red: "+a2.get("red").toString());
//result.add("blue:" +a2.get("blue").toString());
//result.add("green: "+a2.get("green").toString());}

}

if(cl.toString().equals("text"))
{
 Object attrstring=gname.get("attributedString");
JSONObject atrstr=(JSONObject)attrstring;
Object atr1=atrstr.get("attributes");
//System.out.println(atr1+"\n\n");
JSONArray a1=(JSONArray)atr1;
Iterator<JSONObject> colorss = a1.iterator();
//System.out.println("itr created");
int k=0;
Object atr2=new Object();
for(k=0;k<a1.size();k++)
    atr2=colorss.next();
JSONObject c=(JSONObject)atr2;

JSONObject a2=(JSONObject)atr2;
Object attri=a2.get("attributes");
//System.out.println("\n\n"+attri);
a2=(JSONObject)attri;

Object mSSa=a2.get("MSAttributedStringColorAttribute");
JSONObject msa=(JSONObject)mSSa;
result.add(msa.get("red").toString());
result.add(msa.get("blue").toString());
result.add(msa.get("green").toString());

//result.add("red: "+msa.get("red").toString());
//result.add("blue: "+msa.get("blue").toString());
//result.add("green: "+msa.get("green").toString());

}





return result;
}
}