/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program.Objects;

import Program.Enums.UserRank;
import Program.Main;
import java.util.Date;

/**
 *
 * @author MAJ
 */
public final class User {

    private String Username;
    private String Password;
    private int ID;
    private UserRank Rank;
    private Date BanDate;

    public User(String N, String P, String R, int id) {

        setUsername(N);
        SetPassword(P);
        setRank(R);
        if (id == 0) {
            setID();
        } else {
            ID = id;
        }
        BanDate = new Date();
                
    }
    
    public User(String N, String P, String R, int id, Date date) {

        setUsername(N);
        SetPassword(P);
        setRank(R);
        if (id == 0) {
            setID();
        } else {
            ID = id;
        }
        BanDate = date;
                
    }

    public void setUsername(String U) {
        Username = U;
    }

    public void SetPassword(String P) {
        Password = P;
    }

    public void setRank(String R) {
        if (R.equals("Administrator")){
        Rank = UserRank.Administrator;
        } else {
            Rank = UserRank.NormalUser;
        }
    }

    void setID() {

        ID = 1000 + Main.users.size();

    }

    public void setBanDate(Date date) {
        BanDate = date;
    }
    
    @Override
    public String toString() {
        return Integer.toString(ID);
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public UserRank getRank() {
        return Rank;
    }
    
    public Date getBanDate() {
        return BanDate;
    }
    
}
