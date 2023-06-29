/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program.Objects;

/**
 *
 * @author MAJ
 */
public class Report {

    private String AssetID;
    private String AssetModel;
    private String UserID;
    private String Username;
    private String cause;   
    private String repair;
    private String date;

    public Report(String Asset_id, String Asset_model, String User_id, String username, String Cause, String Repair, String Date) {

        AssetID = Asset_id;
        AssetModel = Asset_model;
        UserID = User_id;
        Username = username;
        cause = Cause;
        repair = Repair;
        date = Date;

    }

    public void setAssetID(String assetid) {
        AssetID = assetid;
    }

    public String getAssetID() {
        return AssetID;
    }

    public void setAssetModel(String assetmodel) {
        AssetModel = assetmodel;
    }

    public String getAssetModel() {
        return AssetModel;
    }
    
    public void setUsername(String username) {
        Username = username;
    }

    public String getUsername() {
        return Username;
    }

    public void setUserID(String user_id) {
        UserID = user_id;
    }

    public String getUserID() {
        return UserID;
    }

    public void setCause(String c) {
        cause = c;
    }

    public String getCause() {
        return cause;
    }

    public void setRepair(String r) {
        repair = r;
    }

    public String getRepair() {
        return repair;
    }

    public void setDate(String d) {
        date = d;
    }

    @Override
    public String toString() {
        return date;
    }

}
