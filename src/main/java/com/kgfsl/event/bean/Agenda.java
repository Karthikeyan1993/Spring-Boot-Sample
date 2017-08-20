package com.kgfsl.event.bean;

import javax.persistence.*;

@Entity
public class Agenda {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq")
	@SequenceGenerator(sequenceName = "Update_sequence_ID", allocationSize = 1, name = "id_seq")
	private Long Id;

	@Column(name = "AGENDA_TIM")
	private String aTime;

	@Column(name = "AGENDA_DES")
	private String a_desc;

	@Column(name = "AGENDA_INS")
	private String a_ins;

	@ManyToOne
	@JoinColumn(name = "EVENT_ID")
	private Event event;

	public Agenda() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agenda(String aTime, String a_desc, String a_ins) {
		super();
		this.aTime = aTime;
		this.a_desc = a_desc;
		this.a_ins = a_ins;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getaTime() {
		return aTime;
	}

	public void setaTime(String aTime) {
		this.aTime = aTime;
	}

	public String getA_desc() {
		return a_desc;
	}

	public void setA_desc(String a_desc) {
		this.a_desc = a_desc;
	}

	public String getA_ins() {
		return a_ins;
	}

	public void setA_ins(String a_ins) {
		this.a_ins = a_ins;
	}

//	public Event getEvent() {
//		return event;
//	}

	public void setEvent(Event event) {
		this.event = event;
	}
}
