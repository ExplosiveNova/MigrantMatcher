
package pt.migrantmatcher.facade.dto;



public class AjudasDTO{
	
	private String type;
	private String region;
	private String desc;
	private int ownerPhone;
	private String code;
	private String date;
	
	private int numAloj;
	private String descDono;
	
	public AjudasDTO(String t, int o, String c, String d, String r, String da) {
		
		this.type = t;
		this.ownerPhone = o;
		this.code = c;	
		this.desc = d;
		this.region = r;
		this.date = da;
		
	}
	
	public String getType() {
		return type;
	}
	public String getRegion() {
		return region;
	}
	public String getDesc() {
		return desc;	
	}
	public String getDate() {
		return date;	
	}
	
	public int getOwner() {
		return ownerPhone;
		
	}
	public String getCode() {
		return this.code;
	}
	public void setNum(int i) {
		this.numAloj = i;
	}
	
	public int getNum() {
		return this.numAloj;
	}
	
	public void setDescDono(String s ) {
		this.descDono = s;
	}
	
	public String getDescDono() {
		return this.descDono;
	}
}