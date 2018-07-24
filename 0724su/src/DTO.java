import java.util.Date;

public class DTO {
	
	private int num;
	private String name;
	private int jumsu;
	private Date o;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getJumsu() {
		return jumsu;
	}
	public void setJumsu(int jumsu) {
		this.jumsu = jumsu;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getO() {
		return o;
	}
	public void setO(Date string) {
		this.o = string;
	}
	@Override
	public String toString() {
		return "DTO [num=" + num + ", name=" + name + ", jumsu=" + jumsu + ", o=" + o + "]";
	}
	
}
