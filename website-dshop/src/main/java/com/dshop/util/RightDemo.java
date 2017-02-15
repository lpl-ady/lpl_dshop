package com.dshop.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.dshop.bean.SystemRight;

public class RightDemo {
	
	public static List<SystemRight> getSystemRightList(){
		
		List<SystemRight> list = new ArrayList<SystemRight>();
		//此处必须按深度升序
		for(SystemRight sr : getList()){
			if(sr.getRightParentId() == 0){
				list.add(sr);
			}else{
				if(CollectionUtils.isNotEmpty(list)){
					for(SystemRight srr : list){
						if(sr.getRightParentId() == srr.getRightId()){
							//将之前存入的所有子类查询出来，存入新的类别，最后将所有类别再次存入
							List<SystemRight> temp = srr.getList();
							if(CollectionUtils.isEmpty(temp))
								temp = new ArrayList<SystemRight>();
							temp.add(sr);
							srr.setList(temp);
							break;
						}
						//将第二级列表查出，再次循环
						if(CollectionUtils.isNotEmpty(srr.getList()))
							for(SystemRight srr2 : srr.getList()){
								if(sr.getRightParentId() == srr2.getRightId()){
									List<SystemRight> temp2 = srr2.getList();
									if(CollectionUtils.isEmpty(temp2))
										temp2 = new ArrayList<SystemRight>();
									temp2.add(sr);
									srr2.setList(temp2);
								}
						}	
					}
				}
			}
		}
			
		return list;
	}
	public static List<SystemRight> getList(){
		List<SystemRight> list = new ArrayList<SystemRight>();
		
		//******************************1****************************
		SystemRight rp1 = new SystemRight();
		rp1.setRightIcon("icon-text-width");
		rp1.setRightId(1);
		rp1.setRightName("文字排版");
		rp1.setRightOrder(1);
		rp1.setRightParentId(0);
		rp1.setRightUrl("");
		
		//******************************2****************************
		SystemRight rp2 = new SystemRight();
		rp2.setRightIcon("icon-desktop");
		rp2.setRightId(2);
		rp2.setRightName("管理员");
		rp2.setRightOrder(2);
		rp2.setRightParentId(0);
		rp2.setRightUrl("");
		//###############5##################
		SystemRight rp2_1 = new SystemRight();
		rp2_1.setRightIcon("");
		rp2_1.setRightId(5);
		rp2_1.setRightName("新增管理员");
		rp2_1.setRightOrder(1);
		rp2_1.setRightParentId(2);
		rp2_1.setRightUrl("/admin/manager/add");
		//###############6##################
		SystemRight rp2_2 = new SystemRight();
		rp2_2.setRightIcon("");
		rp2_2.setRightId(6);
		rp2_2.setRightName("二级菜单");
		rp2_2.setRightOrder(2);
		rp2_2.setRightParentId(2);
		rp2_2.setRightUrl("");
			//###############10##################
			SystemRight rp2_2_1 = new SystemRight();
			rp2_2_1.setRightIcon("");
			rp2_2_1.setRightId(10);
			rp2_2_1.setRightName("第一级");
			rp2_2_1.setRightOrder(1);
			rp2_2_1.setRightParentId(6);
			rp2_2_1.setRightUrl("");
			
		//*******************************3***************************
		SystemRight rp3 = new SystemRight();
		rp3.setRightIcon("icon-list");
		rp3.setRightId(3);
		rp3.setRightName("商品管理");
		rp3.setRightOrder(3);
		rp3.setRightParentId(0);
		rp3.setRightUrl("");
		//###############7##################
		SystemRight rp3_1 = new SystemRight();
		rp3_1.setRightIcon("");
		rp3_1.setRightId(7);
		rp3_1.setRightName("新增商品");
		rp3_1.setRightOrder(1);
		rp3_1.setRightParentId(3);
		rp3_1.setRightUrl("/admin/goods/add");
		//###############8##################
		SystemRight rp3_2 = new SystemRight();
		rp3_2.setRightIcon("");
		rp3_2.setRightId(8);
		rp3_2.setRightName("草稿箱");
		rp3_2.setRightOrder(2);
		rp3_2.setRightParentId(3);
		rp3_2.setRightUrl("");
		//******************************4****************************
		SystemRight rp4 = new SystemRight();
		rp4.setRightIcon("icon-file-alt");
		rp4.setRightId(4);
		rp4.setRightName("更多页面");
		rp4.setRightOrder(6);
		rp4.setRightParentId(0);
		rp4.setRightUrl("");
		//################9#################
		SystemRight rp4_1 = new SystemRight();
		rp4_1.setRightIcon("");
		rp4_1.setRightId(9);
		rp4_1.setRightName("404错误页面");
		rp4_1.setRightOrder(1);
		rp4_1.setRightParentId(4);
		rp4_1.setRightUrl("/admin/error404");
		
		
		list.add(rp1);
		list.add(rp2);
		list.add(rp2_1);
		list.add(rp2_2);
		list.add(rp2_2_1);
		list.add(rp3);
		list.add(rp3_1);
		list.add(rp3_2);
		list.add(rp4);
		list.add(rp4_1);
		
		return list;
	}
}
