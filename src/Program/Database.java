/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import static Program.Main.UpdateAssets;
import Program.Objects.*;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author MAJ
 */
public abstract class Database {

    public static void WriteUserlist() {

        User user;
        JSONArray J_arr = new JSONArray();
        JSONObject J_object = new JSONObject();

        for (Object aThi : Main.users) {
            user = (User) aThi;
            // creating MAP 
            Map m = new LinkedHashMap(4);
            // putting data to Map 
            m.put("Username", user.getUsername());
            m.put("Password", user.getPassword());
            m.put("ID", user.toString());
            m.put("UserRank", user.getRank().toString());
            m.put("BanDate", user.getBanDate().toLocaleString());
            J_arr.add(m);
        }
        J_object.put("Users", J_arr);
        try (PrintWriter pw = new PrintWriter("Files/UserList.json")) {
            // writing JSON to file:"UserList.json" in cwd 
            pw.write(J_object.toJSONString());
            pw.flush();
            pw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(Main.login, "An error occurred while writing UserList.json!", "Error", 0);
        }

    }

    public static void ReadUserlist() {

        Object obj = null;
        String UserData[] = new String[5];

        // parsing file "UserList.json"
        try {
            obj = new JSONParser().parse(new FileReader("Files/UserList.json"));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(Main.login, "UserList.json not found!", "Error", 0);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(Main.login, "UserList.json is damaged!", "Error", 0);
        }
        // typecasting obj to JSONObject 
        JSONObject J_object = (JSONObject) obj;
        // getting users info 
        JSONArray J_array = (JSONArray) J_object.get("Users");
        // iterating phoneNumbers 
        Iterator itr2 = J_array.iterator();

        while (itr2.hasNext()) {

            int cnt = 0;
            Iterator<Map.Entry> itr1 = ((Map) itr2.next()).entrySet().iterator();
            while (itr1.hasNext()) {
                Map.Entry pair = itr1.next();
                UserData[cnt] = (String) pair.getValue();
                cnt++;
            }
            // add user to user list
            Main.users.add(new User(UserData[2], UserData[4], UserData[0], 
                    Integer.parseInt(UserData[3]), new Date(UserData[1])));
        }

    }

    public static void WriteAssetlist() {

        JSONArray J_arr = new JSONArray();
        JSONObject J_object = new JSONObject();

        try (PrintWriter pw = new PrintWriter("Files/AssetList.json")) {
            for (Asset asset : Main.assets) {
                // creating MAP 
                Map m = new LinkedHashMap(4);
                // putting data to Map 
                m.put("ID", asset.toString());
                m.put("Type", Integer.toString(asset.getType()));
                m.put("BDate", asset.getBDate());
                m.put("Model", asset.getModel());
                m.put("Location", asset.getLocation()[0] + "," + asset.getLocation()[1]
                        + "," + asset.getLocation()[2]);
                m.put("State", asset.getState().toString());
                switch (asset.getType()) {
                    case 0:
                        Computer pc = (Computer) asset;
                        m.put("CPU", pc.getCPU());
                        m.put("RAM", pc.getRAM());
                        m.put("Hard", pc.getHard());
                        m.put("Graphic", pc.getGraphic());
                        break;
                    case 1:
                        Switch s = (Switch) asset;
                        m.put("PortNumber", Integer.toString(s.getPortNumber()));
                        if (s.getManageable()) {
                            m.put("Manageable", "true");
                        } else {
                            m.put("Manageable", "false");
                        }
                        break;
                    case 2:
                        Printer p = (Printer) asset;
                        if (p.getColorPrint()) {
                            m.put("ColorPrint", "true");
                        } else {
                            m.put("ColorPrint", "false");
                        }
                }
                J_arr.add(m);
            }
            J_object.put("Assets", J_arr);
            // writing JSON to file:"AssetList.json" in cwd 
            pw.write(J_object.toJSONString());
            pw.flush();
            pw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(Main.login, "An error occurred while writing AssetList.json", "Error", 0);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(Main.login, "Asset List is Empty!", "Error", 0);
        }
    }

    public static void ReadAssetlist() {

        Object obj = null;
        String AssetData[] = new String[10];
        ArrayList<Asset> asset_al = new ArrayList();

        // parsing file "AssetList.json"
        try {
            obj = new JSONParser().parse(new FileReader("Files/AssetList.json"));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(Main.login, "AssetList.json not found!", "Error", 0);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(Main.login, "AssetList.json is damaged!", "Error", 0);
        }
        // typecasting obj to JSONObject 
        JSONObject J_object = (JSONObject) obj;
        // getting users info 
        JSONArray J_array = (JSONArray) J_object.get("Assets");
        // iterating phoneNumbers 
        Iterator itr2 = J_array.iterator();

        while (itr2.hasNext()) {
            int cnt = 0;
            Iterator<Map.Entry> itr1 = ((Map) itr2.next()).entrySet().iterator();
            while (itr1.hasNext()) {
                Map.Entry pair = itr1.next();
                AssetData[cnt] = (String) pair.getValue();
                cnt++;
            }

            // add user to user list
            boolean flag;
            switch (AssetData[0]) {
                case "0": // asset be computer
                    Computer pc = new Computer(AssetData[4], AssetData[1], AssetData[8].split(","),
                            AssetData[2], AssetData[5], AssetData[9], AssetData[6], AssetData[3]);
                    asset_al.add(pc);
                    break;
                case "1": // asset be switch
                    flag = AssetData[6].equals("true");
                    Switch s = new Switch(AssetData[3], AssetData[1], AssetData[7].split(","),
                            AssetData[2], Integer.parseInt(AssetData[5]), flag);
                    asset_al.add(s);
                    break;
                case "2": // asset be printer
                    flag = AssetData[3].equals("true");
                    Printer p = new Printer(AssetData[4], AssetData[1], AssetData[6].split(","),
                            AssetData[2], flag);
                    asset_al.add(p);
                    break;
                default:
                    System.out.println();
            }
        }
        Main.assets = asset_al.toArray(new Asset[asset_al.size()]);
        UpdateAssets(1); // loading computers, printers and switches arr

    }

    public static void WriteReportlist() {

        try (PrintWriter pw = new PrintWriter("Files/Reports.txt")) {
            // writing to file:"Reports.txt"
            for (Report report : Main.reports) {
                pw.write("###REPORT NUMBER : " + (Main.reports.indexOf(report) + 1));
                pw.write("\n\tBY : " + report.getUserID() + "-" + report.getUsername());
                pw.write("\n\tAsset : " + report.getAssetID() + "-" + report.getAssetModel());
                pw.write("\n\tCause of Trouble :");
                pw.write("\n\t\t" + report.getCause().replaceAll("\n", "\n\t\t"));
                pw.write("\n\tRepair Method :");
                pw.write("\n\t\t" + report.getRepair().replaceAll("\n", "\n\t\t"));
                pw.write("\nCreated at " + report.toString() + "###\n"); // change with string[6]
            }
            pw.flush();
            pw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(Main.login, "An error occurred while writing Reports.txt!", "Error", 0);
        }

    }

    public static void ReadReportlist() {

        String AssetID = "";
        String AssetModel = "";
        String UserID = "";
        String Username = "";
        String repair = "";
        String cause = "";
        String date;
        String input;
        int cnt = 0;

        try (FileInputStream file = new FileInputStream("Files/Reports.txt")) { // opening file Reports.txt
            Scanner scn = new Scanner(file);    //file to be scanned  
            // returns true if there is another line to read  
            while (scn.hasNextLine()) {
                input = scn.nextLine(); // returns the line that was skipped
                if (input.startsWith("###REPORT")) {
                    cause = "";
                    repair = "";
                    cnt = 0;
                } else if (input.startsWith("\tBY : ")) {
                    input = input.replaceFirst("\tBY : ", "");
                    UserID = input.split("-")[0];
                    Username = input.split("-")[1];
                } else if (input.startsWith("\tAsset : ")) {
                    cnt = 0;
                    input = input.replaceFirst("\tAsset : ", "");
                    AssetID = input.split("-")[0];
                    AssetModel = input.split("-")[1];
                } else if (input.equals("\tCause of Trouble :")) {
                    cnt = 1;
                } else if (input.equals("\tRepair Method :")) {
                    cnt = 2;
                } else if (!input.startsWith("###REPORT") && !input.endsWith("###")) {
                    if (cnt == 1) {
                        cause += "\n" + input.replaceAll("\t\t", "");
                    }
                    if (cnt == 2) {
                        repair += "\n" + input.replaceAll("\t\t", "");
                    }
                } else if (input.endsWith("###")) {
                    cnt = 0;
                    cause = cause.replaceFirst("\n", "");
                    repair = repair.replaceFirst("\n", "");
                    input = input.replaceFirst("Created at ", "");
                    input = input.replaceAll("###", "");
                    date = input;
                    // adding report to list of reports
                    Report report = new Report(AssetID, AssetModel, UserID, Username,
                            cause, repair, date);
                    Main.reports.add(report);
                }
            }
            scn.close(); // closes the scanner  
        } catch (IOException e) {
            JOptionPane.showMessageDialog(Main.login, "File Reports.txt not found!", "Error", 0);
        }

    }

}
