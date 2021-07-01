package com.atguigu.team.service;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;

/**
 * 
 * 
 * @author Chris
 *
 */
public class TeamService {

	private static int counter = 1;// 给memberID赋值使用
	private final int MAX_MEMBER = 5;
	private Programmer[] team = new Programmer[MAX_MEMBER];
	private int total = 0;// 记录开发团队中实际的人数

	public TeamService() {
		super();
	}

	/**
	 * 
	 * 获取开发团队中的所有成员
	 * 
	 * @return
	 */
	public Programmer[] getTeam() {
		Programmer res[] = new Programmer[total];
		for (int i = 0; i < res.length; i++) {
			res[i] = team[i];
		}

		return res;
	}

	/**
	 * 
	 * 将指定的员工更添加到开发团队中
	 * 
	 * @param e
	 * @throws TeamException
	 */
	public void addMember(Employee e) throws TeamException {
		// Team is full
		if (total >= MAX_MEMBER) {
			throw new TeamException("The Dev Team is full");
		}
		// Employee is not programmer
		if (!(e instanceof Programmer)) {
			throw new TeamException("This guy is not a programmer, cannot add to dev team");
		}
		// Employee is already in the team
		if (isExist(e)) {
			throw new TeamException("This employee is alraedy in the team");
		}
		// Employee is in another team

		// e is on vocation

		Programmer p = (Programmer) e;

		// p.getStatus().getNAME().equals("BUSY"); 这种写法不如下面的写法：原因是，"BUSY".的时候一定不会出现空指针异常
//		if ("BUSY".equals(p.getStatus().getNAME())) {
//			throw new TeamException("Employee is in another team");
//		} else if ("VOCATION".equals(p.getStatus().getNAME())) {
//			throw new TeamException("Employee is on vocation");
//		}
		switch (p.getStatus()){
			case BUSY:
				throw new TeamException("Employee is in another team");
			case VOCATION:
				throw new TeamException("Employee is on vocation");
		}
		// At most one architect in one team
		// At most two designers in one team
		// At most three programmers in one team

		// 获取team中已有的成员中架构师，设计师，程序员的人数
		int numOfArch = 0, numOfDes = 0, numOfPro = 0;
		for (int i = 0; i < total; i++) {
			if (team[i] instanceof Architect)
				numOfArch++;
			else if (team[i] instanceof Designer) {
				numOfDes++;
			} else if (team[i] instanceof Programmer) {
				numOfPro++;
			}
		}
		if (p instanceof Architect) {
			if (numOfArch >= 1) {
				throw new TeamException("At most one architect in one team");
			}
		} else if (p instanceof Designer) {
			if (numOfDes >= 2) {
				throw new TeamException("At most two designers in one team");
			}
		} else if (p instanceof Programmer) {
			if (numOfPro >= 3) {
				throw new TeamException("At most three programmers in one team");
			}
		}
		// 将p添加到现有的team中
		team[total++] = p;
		// p的属性需要复制，setStatus
		p.setStatus(Status.BUSY);
		p.setMemberID(counter++);

	}

	// 此处强转成Programmer 用memberID也是可以的，因为不是programmer的都已经走掉了
	private boolean isExist(Employee e) {
		for (int i = 0; i < total; i++) {
			if (team[i].getId() == e.getId()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * 从团队中删除成员
	 * 
	 * @param memberID
	 * @throws TeamException
	 */
	public void removeMember(int memberID) throws TeamException {
		int i = 0;
		for (; i < total; i++) {
			if (team[i].getMemberID() == memberID) {
				team[i].setStatus(Status.FREE);
				break;
			}
		}
		// 未找到指定memberID的条件
		if (i == total) {
			throw new TeamException("Not found memberID ");
		}
		for (int j = i + 1; j < total; j++) {
			team[j - 1] = team[j];
		}

//		team[total--] = null; 写错了应该前--
		team[--total] = null;

	}

}
