package com.autonavi.minimap.ajx3.util;

import com.alipay.mobile.nebula.resourcehandler.H5ResourceHandlerUtil;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class AjxPathList {
    private static final HashMap<String, String> sDATA = new HashMap<>();
    private static final String sJSON = "{\n  \"map\": [{\n    \"old\": \"amap_basemap/src/Agroup/BizBasemapAgroupRemoveGrouperPage.page.js\",\n    \"value\": \"amap_bundle_agroup/src/BizBasemapAgroupRemoveGrouperPage.page.js\"\n  }, {\n    \"old\": \"amap_basemap/src/Agroup/BizBasemapAgroupJoinTeamPage.page.js\",\n    \"value\": \"amap_bundle_agroup/src/BizBasemapAgroupJoinTeamPage.page.js\"\n  }, {\n    \"old\": \"amap_basemap/src/Agroup/BizBasemapAgroupMyGroup.page.js\",\n    \"value\": \"amap_bundle_agroup/src/BizBasemapAgroupMyGroup.page.js\"\n  }, {\n    \"old\": \"amap_basemap/src/Agroup/BizBasemapAGroupNoticePage.page.js\",\n    \"value\": \"amap_bundle_agroup/src/BizBasemapAGroupNoticePage.page.js\"\n  }, {\n    \"old\": \"amap_basemap/src/Agroup/BizBasemapAgroupSettings.page.js\",\n    \"value\": \"amap_bundle_agroup/src/BizBasemapAgroupSettings.page.js\"\n  }, {\n    \"old\": \"amap_basemap/src/Agroup/BizBasemapAgroupTeamNameEditor.page.js\",\n    \"value\": \"amap_bundle_agroup/src/BizBasemapAgroupTeamNameEditor.page.js\"\n  }, {\n    \"old\": \"amap_basemap/src/convoy/index.page.js\",\n    \"value\": \"amap_bundle_convoy/src/index.page.js\"\n  }, {\n    \"old\": \"amap_basemap/src/feedback/src/POINormalFeedback.page.js\",\n    \"value\": \"amap_bundle_basemap_feedback/src/poi/POINormalFeedback.page.js\"\n  }, {\n    \"old\": \"amap_basemap/src/location_select/Homepage.page.js\",\n    \"value\": \"amap_bundle_locationselect/src/Homepage.page.js\"\n  }, {\n    \"old\": \"amap_basemap/src/messagebox/src/MessageBoxPage.page.js\",\n    \"value\": \"amap_bundle_messagebox/src/MessageBoxPage.page.js\"\n  }, {\n    \"old\": \"amap_basemap/src/messagebox/src/MessageBoxMyMsgPage.page.js\",\n    \"value\": \"amap_bundle_messagebox/src/MessageBoxMyMsgPage.page.js\"\n  }, {\n    \"old\": \"amap_basemap/src/messagebox/src/MessageBoxChannelPage.page.js\",\n    \"value\": \"amap_bundle_messagebox/src/MessageBoxChannelPage.page.js\"\n  }, {\n    \"old\": \"amap_basemap/src/secureaide/BizSecureAidePage.page.js\",\n    \"value\": \"amap_bundle_secureaide/src/BizSecureAidePage.page.js\"\n  }, {\n    \"old\": \"amap_basemap/src/secureaide/BizSecureAideDetailPage.page.js\",\n    \"value\": \"amap_bundle_secureaide/src/BizSecureAideDetailPage.page.js\"\n  }, {\n    \"old\": \"amap_basemap/src/route/index.page.js\",\n    \"value\": \"amap_bundle_basemap_route/src/index.page.js\"\n  }, {\n    \"old\": \"amap_basemap/src/route/page/air/AirPage.jsx.js\",\n    \"value\": \"amap_bundle_basemap_route/src/page/air/AirPage.jsx.js\"\n  }, {\n    \"old\": \"amap_basemap/src/route/page/bus/BusPage.jsx.js\",\n    \"value\": \"amap_bundle_basemap_route/src/page/bus/BusPage.jsx.js\"\n  }, {\n    \"old\": \"amap_basemap/src/route/page/car/CarPage.jsx.js\",\n    \"value\": \"amap_bundle_basemap_route/src/page/car/CarPage.jsx.js\"\n  }, {\n    \"old\": \"amap_basemap/src/route/page/coach/CoachPage.jsx.js\",\n    \"value\": \"amap_bundle_basemap_route/src/page/coach/CoachPage.jsx.js\"\n  }, {\n    \"old\": \"amap_basemap/src/route/page/etrip/ETripPage.jsx.js\",\n    \"value\": \"amap_bundle_basemap_route/src/page/etrip/ETripPage.jsx.js\"\n  }, {\n    \"old\": \"amap_basemap/src/route/page/foot/FootPage.jsx.js\",\n    \"value\": \"amap_bundle_basemap_route/src/page/foot/FootPage.jsx.js\"\n  }, {\n    \"old\": \"amap_basemap/src/route/page/motor/MotorPage.jsx.js\",\n    \"value\": \"amap_bundle_basemap_route/src/page/motor/MotorPage.jsx.js\"\n  }, {\n    \"old\": \"amap_basemap/src/route/page/ride/RidePage.jsx.js\",\n    \"value\": \"amap_bundle_basemap_route/src/page/ride/RidePage.jsx.js\"\n  }, {\n    \"old\": \"amap_basemap/src/route/page/train/TrainPageTemp.jsx.js\",\n    \"value\": \"amap_bundle_basemap_route/src/page/train/TrainPageTemp.jsx.js\"\n  }, {\n    \"old\": \"amap_basemap/src/route/page/truck/TruckPage.jsx.js\",\n    \"value\": \"amap_bundle_basemap_route/src/page/truck/TruckPage.jsx.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/car_logo/CarLogoViewController.page.js\",\n    \"value\": \"amap_bundle_carowner/src/car_logo/CarLogoViewController.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/car_owner/CarAddViewController.page.js\",\n    \"value\": \"amap_bundle_carowner/src/car_owner/CarAddViewController.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/car_owner/CarBrandSelectController.page.js\",\n    \"value\": \"amap_bundle_carowner/src/car_owner/CarBrandSelectController.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/car_owner/CarEditViewController.page.js\",\n    \"value\": \"amap_bundle_carowner/src/car_owner/CarEditViewController.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/car_owner/CarHomeViewController.page.js\",\n    \"value\": \"amap_bundle_carowner/src/car_owner/CarHomeViewController.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/car_owner/CarLicenceController.page.js\",\n    \"value\": \"amap_bundle_carowner/src/car_owner/CarLicenceController.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/car_owner/CarListViewController.page.js\",\n    \"value\": \"amap_bundle_carowner/src/car_owner/CarListViewController.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/car_owner/CarLoginGuideController.page.js\",\n    \"value\": \"amap_bundle_carowner/src/car_owner/CarLoginGuideController.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/car_owner/CarScanGuideViewController.page.js\",\n    \"value\": \"amap_bundle_carowner/src/car_owner/CarScanGuideViewController.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/car_owner/CarStyleSelectController.page.js\",\n    \"value\": \"amap_bundle_carowner/src/car_owner/CarStyleSelectController.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/feedback/FeedbackLocation.page.js\",\n    \"value\": \"amap_bundle_basemap_feedback/src/location/FeedbackLocation.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/route/BizRPMainViewController.page.js\",\n    \"value\": \"amap_bundle_basemap_route/src/index.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/route/BizRPBusPopUpView.page.js\",\n    \"value\": \"amap_bundle_basemap_route/src/BizRPBusPopUpView.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/user_center/feedback/detail.jsx.js\",\n    \"value\": \"amap_bundle_basemap_feedback/src/user_center_old/detail.jsx.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/user_center/new_feedback/pages/BizUserFeedBackDetail.page.js\",\n    \"value\": \"amap_bundle_basemap_feedback/src/user_center/pages/BizUserFeedBackDetail.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/user_center/new_feedback/pages/BizUserFeedBackList.page.js\",\n    \"value\": \"amap_bundle_basemap_feedback/src/user_center/pages/BizUserFeedBackList.page.js\"\n  }, {\n    \"old\": \"amap_informationservice/src/offline/alongwayquery/index.jsx.js\",\n    \"value\": \"amap_bundle_offline/src/alongwayquery/index.jsx.js\"\n  }, {\n    \"old\": \"amap_informationservice/src/offline/alongwayquery/libraries/citylist/index.jsx.js\",\n    \"value\": \"amap_bundle_offline/src/alongwayquery/libraries/citylist/index.jsx.js\"\n  }, {\n    \"old\": \"amap_informationservice/src/offline/auto/index.jsx.js\",\n    \"value\": \"amap_bundle_offline/src/auto/index.jsx.js\"\n  }, {\n    \"old\": \"amap_informationservice/src/offline/auto/lib/sendcarapk/index.jsx.js\",\n    \"value\": \"amap_bundle_offline/src/auto/lib/sendcarapk/index.jsx.js\"\n  }, {\n    \"old\": \"amap_informationservice/src/offline/homePage/HomePage.tsx.js\",\n    \"value\": \"amap_bundle_offline/src/homePage/HomePage.tsx.js\"\n  }, {\n    \"old\": \"amap_informationservice/src/offline/setting/SettingPage.tsx.js\",\n    \"value\": \"amap_bundle_offline/src/setting/SettingPage.tsx.js\"\n  }, {\n    \"old\": \"amap_informationservice/src/offline/storage/StoragePage.tsx.js\",\n    \"value\": \"amap_bundle_offline/src/storage/StoragePage.tsx.js\"\n  }],\n  \"info\": [{\n    \"old\": \"amap_lifeservice/src/poi/common/guide/guide.page.js\",\n    \"value\": \"amap_bundle_poi/src/common/guide/guide.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/new_landing_page/IndexViewController.page.js\",\n    \"value\": \"amap_bundle_landing_page/src/IndexViewController.page.js\"\n  }, {\n    \"old\": \"amap_informationservice/src/search/business/idqplus/idqframework/IDQPlusPage.tsx.js\",\n    \"value\": \"amap_bundle_idqplus/src/idqframework/IDQPlusPage.tsx.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/poi/poi.jsx.js\",\n    \"value\": \"amap_bundle_poi/src/poi.jsx.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/poi/business/hotel/calendar/index.js\",\n    \"value\": \"amap_bundle_poi/src/business/hotel/calendar/index.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/poi/common/paylist/paylist-detail.jsx.js\",\n    \"value\": \"amap_bundle_poi/src/common/paylist/paylist-detail.jsx.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/poi/business/dining/comment/more/index.jsx.js\",\n    \"value\": \"amap_bundle_poi/src/business/dining/comment/more/index.jsx.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/poi/business/scenicspot/inner_scenic/inner_scenic_list.jsx.js\",\n    \"value\": \"amap_bundle_poi/src/business/scenicspot/inner_scenic/inner_scenic_list.jsx.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/poi/business/scenicspot/scenicticket/scenicticketlistall/ScenicTicketListAll.jsx.js\",\n    \"value\": \"amap_bundle_poi/src/business/scenicspot/scenicticket/scenicticketlistall/ScenicTicketListAll.jsx.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/poi/business/dining/addressContribution/more/more.jsx.js\",\n    \"value\": \"amap_bundle_poi/src/business/dining/addressContribution/more/more.jsx.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/poi/common/comment/more/index.jsx.js\",\n    \"value\": \"amap_bundle_poi/src/common/comment/more/index.jsx.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/poi/business/scenicspot/scenic_dining/ScenicDiningMore.jsx.js\",\n    \"value\": \"amap_bundle_poi/src/business/scenicspot/scenic_dining/ScenicDiningMore.jsx.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/poi/business/school/entrance-detail/index.jsx.js\",\n    \"value\": \"amap_bundle_poi/src/business/school/entrance-detail/index.jsx.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/poi/business/school/detail-detail/index.jsx.js\",\n    \"value\": \"amap_bundle_poi/src/business/school/detail-detail/index.jsx.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/poi/business/school/dicingArea-detail/index.jsx.js\",\n    \"value\": \"amap_bundle_poi/src/business/school/dicingArea-detail/index.jsx.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/poi/business/school/enroll_rules-detail/index.jsx.js\",\n    \"value\": \"amap_bundle_poi/src/business/school/enroll_rules-detail/index.jsx.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/poi/common/airportService/airportServiceDetail.jsx.js\",\n    \"value\": \"amap_bundle_poi/src/common/airportService/airportServiceDetail.jsx.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/poi/common/media/media-more.jsx.js\",\n    \"value\": \"amap_bundle_poi/src/common/media/media-more.jsx.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/poi/business/hospital/cheap/index.jsx.js\",\n    \"value\": \"amap_bundle_poi/src/business/hospital/cheap/index.jsx.js\"\n  }, {\n    \"old\": \"amap_informationservice/src/search/business/search_result/pages/SearchResultPage.tsx.js\",\n    \"value\": \"amap_bundle_search/src/search_result/pages/SearchResultPage.tsx.js\"\n  }, {\n    \"old\": \"amap_informationservice/src/search/business/home/pages/HomePage.tsx.js\",\n    \"value\": \"amap_bundle_search/src/home/pages/HomePage.tsx.js\"\n  }, {\n    \"old\": \"amap_informationservice/src/search/business/search_result/pages/CitySelectorPage.tsx.js\",\n    \"value\": \"amap_bundle_search/src/search_result/pages/CitySelectorPage.tsx.js\"\n  }, {\n    \"old\": \"amap_informationservice/src/search/business/search_result/pages/LandMarkSelectorPage.tsx.js\",\n    \"value\": \"amap_bundle_search/src/search_result/pages/LandMarkSelectorPage.tsx.js\"\n  }, {\n    \"old\": \"amap_informationservice/src/search/business/search_result/pages/SubwayLandMarkSelectorPage.tsx.js\",\n    \"value\": \"amap_bundle_search/src/search_result/pages/SubwayLandMarkSelectorPage.tsx.js\"\n  }, {\n    \"old\": \"amap_informationservice/src/search/business/search_result/pages/MoreLandMarkSelectorPage.tsx.js\",\n    \"value\": \"amap_bundle_search/src/search_result/pages/MoreLandMarkSelectorPage.tsx.js\"\n  }, {\n    \"old\": \"amap_informationservice/src/search/business/search_result/pages/search_result_preload.js\",\n    \"value\": \"amap_bundle_search/src/search_result/pages/search_result_preload.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/poi/common/addressContribution/more/more.jsx.js\",\n    \"value\": \"amap_bundle_poi/src/common/addressContribution/more/more.jsx.js\"\n  }],\n  \"drive\": [{\n    \"old\": \"amap_drive/src/car/navi_page/CarNaviPage.page.js\",\n    \"value\": \"amap_bundle_drive/src/car/navi_page/CarNaviPage.page.js\"\n  }, {\n    \"old\": \"amap_drive/src/car/navi_page/CarNaviSimulatePage.page.js\",\n    \"value\": \"amap_bundle_drive/src/car/navi_page/CarNaviSimulatePage.page.js\"\n  }, {\n    \"old\": \"amap_drive/src/car/preview_page/CarPreviewPage.page.js\",\n    \"value\": \"amap_bundle_drive/src/car/preview_page/CarPreviewPage.page.js\"\n  }, {\n    \"old\": \"amap_drive/src/car/end_page/CarEndPage.page.js\",\n    \"value\": \"amap_bundle_drive/src/car/end_page/CarEndPage.page.js\"\n  }, {\n    \"old\": \"amap_drive/src/cruise/CarCruisePage.page.js\",\n    \"value\": \"amap_bundle_drive/src/cruise/CarCruisePage.page.js\"\n  }, {\n    \"old\": \"amap_drive/src/etd/page/RouteETDPage.page.js\",\n    \"value\": \"amap_bundle_drive/src/etd/page/RouteETDPage.page.js\"\n  }, {\n    \"old\": \"amap_drive/src/etrip/page/ETripPathResult.page.js\",\n    \"value\": \"amap_bundle_tripgroup/src/etrip/page/ETripPathResult.page.js\"\n  }, {\n    \"old\": \"amap_drive/src/car/report_page/CarErrorReportPage.page.js\",\n    \"value\": \"amap_bundle_drive/src/car/report_page/CarErrorReportPage.page.js\"\n  }, {\n    \"old\": \"amap_drive/src/car/restrict_page/CarRestrictPage.page.js\",\n    \"value\": \"amap_bundle_drive/src/car/restrict_page/CarRestrictPage.page.js\"\n  }, {\n    \"old\": \"amap_drive/src/car/result_page/CarResultPage.page.js\",\n    \"value\": \"amap_bundle_drive/src/car/result_page/CarResultPage.page.js\"\n  }, {\n    \"old\": \"amap_drive/src/car/result_page/tips_detail/CarTipsDetailPage.page.js\",\n    \"value\": \"amap_bundle_drive/src/car/result_page/tips_detail/CarTipsDetailPage.page.js\"\n  }, {\n    \"old\": \"amap_drive/src/car/vui/vui_help_center.page.js\",\n    \"value\": \"amap_bundle_drive/src/car/vui/vui_help_center.page.js\"\n  }, {\n    \"old\": \"amap_drive/src/motorbike/end_page/MotorBikeEndPage.page.js\",\n    \"value\": \"amap_bundle_motorbike/src/motorbike/end_page/MotorBikeEndPage.page.js\"\n  }, {\n    \"old\": \"amap_drive/src/motorbike/navi_page/MotorBikeNaviPage.page.js\",\n    \"value\": \"amap_bundle_motorbike/src/navi_page/MotorBikeNaviPage.page.js\"\n  }, {\n    \"old\": \"amap_drive/src/motorbike/preview_page/MotorBikePreviewPage.page.js\",\n    \"value\": \"amap_bundle_motorbike/src/preview_page/MotorBikePreviewPage.page.js\"\n  }, {\n    \"old\": \"amap_drive/src/motorbike/report_page/MotorBikeErrorReportPage.page.js\",\n    \"value\": \"amap_bundle_motorbike/src/report_page/MotorBikeErrorReportPage.page.js\"\n  }, {\n    \"old\": \"amap_drive/src/motorbike/result_page/MotorBikeResultPage.page.js\",\n    \"value\": \"amap_bundle_motorbike/src/result_page/MotorBikeResultPage.page.js\"\n  }, {\n    \"old\": \"amap_drive/src/motorbike/navi_page/MotorBikeNaviSimulatePage.page.js\",\n    \"value\": \"amap_bundle_motorbike/src/navi_page/MotorBikeNaviSimulatePage.page.js\"\n  }, {\n    \"old\": \"amap_drive/src/motorbike/navi_page/component/guide/views/MotorBikeSetNumber.page.js\",\n    \"value\": \"amap_bundle_motorbike/src/navi_page/component/guide/views/MotorBikeSetNumber.page.js\"\n  }, {\n    \"old\": \"amap_drive/src/motorbike/restrict_page/MotorBikeRestrictPage.page.js\",\n    \"value\": \"amap_bundle_motorbike/src/restrict_page/MotorBikeRestrictPage.page.js\"\n  }, {\n    \"old\": \"amap_drive/src/motorbike/result_page/tips_detail/MotorBikeTipsDetailPage.page.js\",\n    \"value\": \"amap_bundle_motorbike/src/result_page/tips_detail/MotorBikeTipsDetailPage.page.js\"\n  }, {\n    \"old\": \"amap_drive/src/radar/DriveRadar.page.js\",\n    \"value\": \"amap_bundle_drive/src/radar/DriveRadar.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/share_bike/UnLockPage.page.js\",\n    \"value\": \"amap_bundle_tripgroup/src/share_bike/UnLockPage.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/share_bike/ShareBikeScanQRCode.page.js\",\n    \"value\": \"amap_bundle_tripgroup/src/share_bike/ShareBikeScanQRCode.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/share_bike/ShareBikeLoginPage.page.js\",\n    \"value\": \"amap_bundle_tripgroup/src/share_bike/ShareBikeLoginPage.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/share_bike/ShareBikeScanResult.page.js\",\n    \"value\": \"amap_bundle_tripgroup/src/share_bike/ShareBikeScanResult.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/car_owner/CarSelectViewController.page.js\",\n    \"value\": \"amap_bundle_drive/src/car/select_page/CarSelectViewController.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/share_bike/BannerPage.page.js\",\n    \"value\": \"amap_bundle_tripgroup/src/share_bike/BannerPage.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/share_bike/CheckLock.page.js\",\n    \"value\": \"amap_bundle_tripgroup/src/share_bike/CheckLock.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/share_bike/ShareBikeAgreement.page.js\",\n    \"value\": \"amap_bundle_tripgroup/src/share_bike/ShareBikeAgreement.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/share_bike/ShareBikeAuthor.page.js\",\n    \"value\": \"amap_bundle_tripgroup/src/share_bike/ShareBikeAuthor.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/share_bike/ShareBikeDocument.page.js\",\n    \"value\": \"amap_bundle_tripgroup/src/share_bike/ShareBikeDocument.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/share_bike/ShareBikeHelp.page.js\",\n    \"value\": \"amap_bundle_tripgroup/src/share_bike/ShareBikeHelp.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/share_bike/ShareBikeHistory.page.js\",\n    \"value\": \"amap_bundle_tripgroup/src/share_bike/ShareBikeHistory.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/share_bike/ShareBikeWalletDetail.page.js\",\n    \"value\": \"amap_bundle_tripgroup/src/share_bike/ShareBikeWalletDetail.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/share_bike/TipIndex.page.js\",\n    \"value\": \"amap_bundle_tripgroup/src/share_bike/TipIndex.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/share_bike/WalletListPage.page.js\",\n    \"value\": \"amap_bundle_tripgroup/src/share_bike/WalletListPage.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/key_detection/keyDetectionDetails.page.js\",\n    \"value\": \"amap_bundle_tripgroup/src/key_detection/keyDetectionDetails.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/key_detection/keyDetection.page.js\",\n    \"value\": \"amap_bundle_tripgroup/src/key_detection/keyDetection.page.js\"\n  }],\n  \"other\": [{\n    \"old\": \"amap_lifeservice/src/activity/fun_trip/pages/add/ftp_add.page.js\",\n    \"value\": \"amap_bundle_activity_fun_trip/src/pages/add/ftp_add.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/activity/fun_trip/pages/detail/ft_detail.page.js\",\n    \"value\": \"amap_bundle_activity_fun_trip/src/pages/detail/ft_detail.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/activity/fun_trip/pages/index.page.js\",\n    \"value\": \"amap_bundle_activity_fun_trip/src/pages/index.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/activity/fun_trip/pages/list/ft_list.page.js\",\n    \"value\": \"amap_bundle_activity_fun_trip/src/pages/list/ft_list.page.js\"\n  }, {\n    \"old\": \"amap_lifeservice/src/activity/fun_trip/pages/my_tril/ft_mytril.page.js\",\n    \"value\": \"amap_bundle_activity_fun_trip/src/pages/my_tril/ft_mytril.page.js\"\n  }, {\n    \"old\": \"amap_lib/baseui/city_selector/CLCitySelectorPage.tsx.js\",\n    \"value\": \"amap_bundle_lib_aux/src/components/deprecated/CitySelector/CLCitySelectorPage.tsx.js\"\n  }]\n}";

    static {
        try {
            JSONObject jSONObject = new JSONObject(sJSON);
            JSONArray jSONArray = jSONObject.getJSONArray("map");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sDATA.put(jSONObject2.getString("old"), jSONObject2.getString("value"));
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("info");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                sDATA.put(jSONObject3.getString("old"), jSONObject3.getString("value"));
            }
            JSONArray jSONArray3 = jSONObject.getJSONArray("drive");
            for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                JSONObject jSONObject4 = jSONArray3.getJSONObject(i3);
                sDATA.put(jSONObject4.getString("old"), jSONObject4.getString("value"));
            }
            JSONArray jSONArray4 = jSONObject.getJSONArray(H5ResourceHandlerUtil.OTHER);
            for (int i4 = 0; i4 < jSONArray4.length(); i4++) {
                JSONObject jSONObject5 = jSONArray4.getJSONObject(i4);
                sDATA.put(jSONObject5.getString("old"), jSONObject5.getString("value"));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025 A[Catch:{ Exception -> 0x004f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String transform(java.lang.String r5) {
        /*
            java.lang.String r0 = ""
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x004f }
            if (r1 != 0) goto L_0x001c
            java.lang.String r1 = "://"
            int r1 = r5.indexOf(r1)     // Catch:{ Exception -> 0x004f }
            if (r1 < 0) goto L_0x001c
            r0 = 0
            int r1 = r1 + 3
            java.lang.String r0 = r5.substring(r0, r1)     // Catch:{ Exception -> 0x004f }
            java.lang.String r1 = r5.substring(r1)     // Catch:{ Exception -> 0x004f }
            goto L_0x001d
        L_0x001c:
            r1 = r5
        L_0x001d:
            java.util.HashMap<java.lang.String, java.lang.String> r2 = sDATA     // Catch:{ Exception -> 0x004f }
            boolean r2 = r2.containsKey(r1)     // Catch:{ Exception -> 0x004f }
            if (r2 == 0) goto L_0x004f
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x004f }
            r2.<init>()     // Catch:{ Exception -> 0x004f }
            java.lang.String r3 = "url"
            r2.put(r3, r5)     // Catch:{ Exception -> 0x004f }
            java.lang.String r3 = "P00380"
            java.lang.String r4 = "B006"
            com.amap.bundle.statistics.LogManager.actionLogV2(r3, r4, r2)     // Catch:{ Exception -> 0x004f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004f }
            r2.<init>()     // Catch:{ Exception -> 0x004f }
            r2.append(r0)     // Catch:{ Exception -> 0x004f }
            java.util.HashMap<java.lang.String, java.lang.String> r0 = sDATA     // Catch:{ Exception -> 0x004f }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x004f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x004f }
            r2.append(r0)     // Catch:{ Exception -> 0x004f }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x004f }
            return r0
        L_0x004f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.autonavi.minimap.ajx3.util.AjxPathList.transform(java.lang.String):java.lang.String");
    }
}