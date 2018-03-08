package com.island.stone.pojo;

public class ContCountry {

	private	int		seq;
	private	int		cont_seq;
	private	String	abbr;
	private	String	name;
	private	int		population;
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getCont_seq() {
		return cont_seq;
	}
	public void setCont_seq(int cont_seq) {
		this.cont_seq = cont_seq;
	}
	public String getAbbr() {
		return abbr;
	}
	public void setAbbr(String abbr) {
		this.abbr = abbr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int popukation) {
		this.population = popukation;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((abbr == null) ? 0 : abbr.hashCode());
		result = prime * result + cont_seq;
		result = prime * result + seq;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContCountry other = (ContCountry) obj;
		if (abbr == null) {
			if (other.abbr != null)
				return false;
		} else if (!abbr.equals(other.abbr))
			return false;
		if (cont_seq != other.cont_seq)
			return false;
		if (seq != other.seq)
			return false;
		return true;
	}
	
}
