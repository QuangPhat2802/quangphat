package com.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.VoucherDao;
import com.demo.entity.VoucherEntity;
import com.demo.service.VoucherService;

@Service
@Transactional
public class VoucherServiceIMpl implements VoucherService {

	@Autowired
	VoucherDao voucherDao;

	@Override
	public List<VoucherEntity> getAll() {
		// TODO Auto-generated method stub
		return voucherDao.findAll();
	}

	@Override
	public List<VoucherEntity> findVoucherCodeByPhone(int phone, double minPrice) {
		// TODO Auto-generated method stub
		return voucherDao.findByPhoneLike(phone, minPrice);
	}

	@Override
	public VoucherEntity addPhone(VoucherEntity voucherEntity) {
		// TODO Auto-generated method stub
		return voucherDao.saveAndFlush(voucherEntity);
	}

	@Override
	public List<VoucherEntity> searchVoucherByStatus(int status) {

		if (status == 0) {

		}

		return voucherDao.findByStatusLike(status);
	}

	@Override
	public VoucherEntity findByVoucherCode(String voucherCode) {

		return voucherDao.findByVoucherCode(voucherCode);
	}

}
