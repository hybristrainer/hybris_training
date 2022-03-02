///**
// *
// */
//package com.training.v2.controller;
//
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.trainee.accenture.facades.AccentureFacade;
//import com.trainee.facades.accenture.AccentureData;
//import com.trainee.facades.accenture.AccentureListData;
//
//
//
///**
// * @author ICON
// *
// */
//
//
//@Controller
//@RequestMapping("{baseSiteId}/accenture")
//public class AccentureController extends BaseController
//{
//	@Resource(name = "accentureFacade")
//	private AccentureFacade accentureFacade;
//
//	@RequestMapping("/list")
//	@ResponseBody
//	public AccentureListWSDTO getaccenture(final String fields)
//	{
//		final List<AccentureData> accenture = accentureFacade.getAccenture();
//		final AccentureListData accentureListData = new AccentureListData();
//		accentureListData.setAccenture(accenture);
//		return getDataMapper().map(accentureListData, AccentureListWSDTO.class, fields);
//	}
//}
