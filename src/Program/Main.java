package Program;

import GUI.*;
import Program.Objects.*;
import Program.Enums.UserRank;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author MAJ
 */
public class Main {

    // create main JFrame
    public static LoginJFrame login;

    // Create Array lists
    public static ArrayList<User> users = new ArrayList();
    public static ArrayList<Computer> computers = new ArrayList();
    public static ArrayList<Switch> switches = new ArrayList();
    public static ArrayList<Printer> printers = new ArrayList();
    public static ArrayList<Report> reports = new ArrayList();
    public static Asset[] assets = new Asset[0];

    public static void main(String[] args) {
        
        try {
            login = new LoginJFrame();
            LoadAllData();
            Main.login.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(Main.login, "Something Unexcepted Happend! Trying to save data!", "Error", 0);
        } finally {
            // save all data when login JFrame closes
            login.addWindowListener(new WindowEventHandler());
        }

    }

    static void LoadAllData() {

        Database.ReadUserlist(); // loading users arr
        Database.ReadAssetlist(); // loading assets arr
        Database.ReadReportlist(); // loading reports

    }

    public static void SaveAllData() {

        Database.WriteUserlist(); // saving users arr
        Database.WriteAssetlist(); // saving assets arr
        Database.WriteReportlist(); // saving reports arr
        JOptionPane.showMessageDialog(Main.login, "Everything is saved!", "Good News", 1);

    }

    public static void BacktoMainMenu() {
        if (login.getUser().getRank() == UserRank.Administrator) {
            login.setContentPane(new AdminMenuJPanel());
        } else {
            login.setContentPane(new UserMenuJPanel());
        }
        login.pack();
    }

    public static void UpdateAssets(int i) {

        switch (i) {
            case 0:
                ArrayList<Asset> asset_al = new ArrayList();
                asset_al.addAll(computers);
                asset_al.addAll(switches);
                asset_al.addAll(printers);
                assets = new Asset[asset_al.size()];
                assets = asset_al.toArray(assets);
                break;
            case 1:
                for (Asset asset : assets) {
                    switch (asset.getType()) {
                        case 0:
                            computers.add((Computer) asset);
                            break;
                        case 1:
                            switches.add((Switch) asset);
                            break;
                        case 2:
                            printers.add((Printer) asset);
                            break;
                    }
                }
        }

    }


}
