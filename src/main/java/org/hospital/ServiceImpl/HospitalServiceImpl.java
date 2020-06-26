package org.hospital.ServiceImpl;

import java.util.List;

import org.hospital.Dao.HospitalMapper;
import org.hospital.Service.HospitalService;
import org.hospital.pojo.Department;
import org.hospital.pojo.Doctor;
import org.hospital.pojo.DoctorWithDepart;
import org.hospital.pojo.Medicine;
import org.hospital.pojo.Patient;
import org.hospital.pojo.Pay;
import org.hospital.pojo.Treatment;
import org.hospital.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class HospitalServiceImpl implements HospitalService{
	
	@Autowired
	public HospitalMapper hosMapper;

	@Override
	@Transactional
	public boolean insertPatient(Patient patient) {//插入
		int flag = hosMapper.insertPatient(patient);
		if (flag > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updatePatient(Patient patient) {
		boolean flag=true;
		int isExit = hosMapper.selectExit(patient.getId());
		if (isExit > 0) {
            int isUpdate=hosMapper.updatePatient(patient);
            flag=isUpdate>0?true:false;
		} else {
			flag= false;
		}
		return flag;
	}

	@Override
	@Transactional
	public boolean deletePatient(int id) {//删除，先查找再删除
		boolean flag=true;
		int isExit = hosMapper.selectExit(id);
		if (isExit > 0) {
			int isDelete =hosMapper.deletePatient(id);
			flag=isDelete>0?true:false;
		} else {
			flag= false;
		}
		return flag;
	}

	@Override
	public List<Patient> selectAllPatient() {
		return hosMapper.selectAllPatient();
	}


	@Override
	public Patient selectByID(int id) {
		return hosMapper.selectByID(id);
	}

	@Override
	public boolean insertDoctor(Doctor doctor) {
		int flag=hosMapper.insertDoctor(doctor);
		if (flag > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Doctor selectDorById(int id) {
		return hosMapper.selectDorById(id);
	}

	@Override
	public List<Doctor> selectAllDoctor() {
		return hosMapper.selectAllDoctor();
	}
	
	@Override
	public boolean deleteDor(int id) {
		boolean flag=true;
		int isExit=hosMapper.selectDorExit(id);
		if(isExit>0) {
			int isDelete=hosMapper.deleteDor(id);
			flag=isDelete>0?true:false;
		}else {
			flag=false;
		}
		return flag;
	}
	

	@Override
	public boolean updateDoctor(Doctor doctor) {
		boolean flag=true;
		int isExit=hosMapper.selectDorExit(doctor.getId());
		if(isExit>0) {
			int isupdate=hosMapper.updateDoctor(doctor);
			flag=isupdate>0?true:false;
		}else {
			flag=false;
		}
		return false;
	}

	@Override
	public boolean addDepartment(Department department) {
		int flag=hosMapper.addDepartment(department);
		if(flag>0) {
			return true;
		}else {
		return false;
		}
	}

	@Override
	public boolean updateDEPART(Department department) {
		boolean flag=true;
		int isExit=hosMapper.selectDEExit(department.getId());
		if(isExit>0) {
			int isUpdate=hosMapper.updateDEPART(department);
			flag=isUpdate>0?true:false;
		}else {
			flag=false;
		}
		return flag;
	}

	@Override
	public List<Department> selectAllDer() {
		return hosMapper.selectAllDer();
	}

	@Override
	public boolean addPay(Pay pay) {
		int flag=hosMapper.addPay(pay);
		if(flag>0) {
		    return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean deletePay(int id) {
		boolean flag=true;
		int isExit=hosMapper.payExit(id);
		if(isExit>0) {
			int isDelete=hosMapper.deletePay(id);
			flag=isDelete>0?true:false;
		}else {
			flag=false;
		}
		return flag;
	}
	
	@Override
	public boolean updatePay(Pay pay) {
        boolean flag=true;
        int isExit=hosMapper.payExit(pay.getId());
        if(isExit>0) {
        	int isUpdate=hosMapper.updatePay(pay);
        	flag=(isUpdate>0)?true:false;
        }else {
        	flag=false;
        }
		return flag;
	}



	@Override
	public List<Pay> selectAllpay() {
		return hosMapper.selectAllpay();
	}

	@Override
	public Pay selectPayById(int id) {
		return hosMapper.selectPayById(id);
	}

	@Override
	public List<Medicine> selectAllMe() {
		return hosMapper.selectAllMe();
	}

	@Override
	public boolean addMedicine(Medicine medicine) {
		int flag=hosMapper.addMedicine(medicine);
		if(flag>0) {
		    return true;
		}else {
			return false;
		}
	}
	
	@Override
	public boolean updateMeNumber(Medicine medicine) {
		return hosMapper.updateMeNumber(medicine);
		
	}

	@Override
	public Medicine selectMeById(int id) {
		return hosMapper.selectMeById(id);
	}

	@Override
	public List<Treatment> selectTreatById(int id) {
		return hosMapper.selectTreatById(id);
	}

	@Override
	public List<Treatment> selectAllTreat() {
		return hosMapper.selectAllTreat();
	}

	@Override
	public boolean updateTreat(int id) {
		return hosMapper.updateTreat(id);
		
	}

	@Override
	public List<Treatment> selectEmptyTreat() {
		return hosMapper.selectEmptyTreat();
	}

	@Override
	public List<DoctorWithDepart> selectDeDor(int id) {
		return hosMapper.selectDeDor(id);
	}

	@Override
	public List<Treatment> selectTreatByTime(String createTime) {
		return hosMapper.selectTreatByTime(createTime);
	}


	@Override
	public int login(User user) {
		int flag=hosMapper.login(user);
		if(flag>0) {
			return 1;
		}else {
			return 0;
		}
	}

	@Override
	public boolean regist(User user) {
        boolean flag=true;
        int num=hosMapper.isUserSet(user.getUserName());
        if(num>0) {
        	flag=false;
        }else {
        	int fine=hosMapper.regist(user);
        	flag=(fine>0)?true:false;
        }
		return flag;
	}

	


	
	

}
