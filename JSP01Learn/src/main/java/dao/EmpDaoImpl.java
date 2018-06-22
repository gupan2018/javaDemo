package dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import entity.Emp;

public class EmpDaoImpl implements EmpDao, Serializable {
	// 模拟实现查询所有员工
	public List<Emp> findAll() {
		List<Emp> list =
				new ArrayList<Emp>();
		Emp e1 = new Emp();
		e1.setEmpno(1);
		e1.setEname("滚滚");
		e1.setJob("领导");
		e1.setSal(100000.0);
		list.add(e1);
		
		Emp e2 = new Emp();
		e2.setEmpno(1);
		e2.setEname("圆滚滚");
		e2.setJob("临时工");
		e2.setSal(1000.0);
		list.add(e2);
		
		Emp e3 = new Emp();
		e3.setEmpno(1);
		e3.setEname("向前滚");
		e3.setJob("背锅侠");
		e3.setSal(200000.0);
		list.add(e3);
		return list;
	}
	// 新增员工
	public void save(Emp e) {
		System.out.println(
				"增加员工" + e.getEname());
	}
}
