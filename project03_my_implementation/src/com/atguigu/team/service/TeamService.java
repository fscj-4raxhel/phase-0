package com.atguigu.team.service;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;

public class TeamService {
	private static int counter = 1;
	private static final int MAX_MEMBER = 5;
	private Programmer[] team = new Programmer[MAX_MEMBER];
	private int total = 0;

	public Programmer[] getTeam() {
		if (total == 0)
			return null;
		else {
			Programmer[] res = new Programmer[total];
			for (int i = 0; i < total; i++) {
				res[i] = team[i];
			}
			return res;
		}

	}// getTeam()

	public void addMember(Employee e) throws TeamException {
		// 很多原因会失败，失败的话就报错，如果都不失败的话就把员工加进来
		// 1. team if full
		if (total == MAX_MEMBER) {
			throw new TeamException("Team is full");
		}
		// 2. e is not a programmer
		if (!(e instanceof Programmer)) {
			throw new TeamException("Cannot add non-programmer to Dev team");
		}
		// 3. e is already in the team
		for (int i = 0; i < total; i++) {
			if (team[i].getId() == e.getId()) {
				throw new TeamException("This employee is already in the team");
			}
		}
		// 4. e is busy or vocation
		Programmer p = (Programmer) e;
		if ("BUSY".equals(p.getStatus().getName())) {
			throw new TeamException("Cannot add a programmer who is in another team");
		} else if ("VOCATION".equals(p.getStatus().getName())) {
			throw new TeamException("Cannot add a programmer who is on vocation");
		}
		// 5. At most one Architect
		// 6. At most two Designers
		// 7. At most three programmers

		int nArc = 0, nDes = 0, nPro = 0;
		for (int i = 0; i < total; i++) {
			if (team[i] instanceof Architect) {
				nArc++;
			} else if (team[i] instanceof Designer) {
				nDes++;
			} else if (team[i] instanceof Programmer) {
				nPro++;
			}
		}
		if (p instanceof Architect) {
			if (nArc >= 1) {
				throw new TeamException("At most one Architect");
			}
		} else if (p instanceof Designer) {
			if (nDes >= 2) {
				throw new TeamException("At most two Designers");
			}
		} else if (p instanceof Programmer) {
			if (nPro >= 3) {
				throw new TeamException(" At most three programmers");
			}
		}

		// 添加成员
		team[total++] = p;
		p.setStatus(Status.BUSY);
		// 别忘了给一个memberID
		p.setMemberId(counter++);
	}

	public void removeMember(int memberId) throws TeamException {
		int i = 0;
		for (; i < total; i++) {
			if (team[i].getMemberId() == memberId) {
				break;
			}
		}
		if (i == total)
			throw new TeamException("Employee with memberId  " + memberId + " not found");
		for (int j = i + 1; j < total; j++) {
			team[j - 1] = team[j];
		}
		team[--total] = null;
		team[i].setStatus(Status.FREE);
	}
}
