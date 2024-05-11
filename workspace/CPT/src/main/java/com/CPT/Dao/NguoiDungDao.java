package com.CPT.Dao;

import com.CPT.Entities.NguoiDung;

public interface NguoiDungDao {
	
	public boolean register(NguoiDung nd); 
	
//	public NguoiDung login(String email, String password);
	
	NguoiDung findByEmail (String email);
	
	public class VaiTro {
	    private String tenVaiTro;

	    public String getTenVaiTro() {
	        return tenVaiTro;
	    }

	    public void setTenVaiTro(String tenVaiTro) {
	        this.tenVaiTro = tenVaiTro;
	    }
	}
}
