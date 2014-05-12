package sjsu.cmpe272;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sjsu.cmpe272.entity.Forecast;
import sjsu.cmpe272.entity.MonthlyReport;
import sjsu.cmpe272.entity.MonthlyReportInflow;
import sjsu.cmpe272.entity.MonthlyReportOutflow;
import sjsu.cmpe272.entity.RegressionForecast;
import sjsu.cmpe272.entity.Reservoir;
import sjsu.cmpe272.entity.YearlyInflowReport;
import sjsu.cmpe272.entity.YearlyReportOutflow;
import sjsu.cmpe272.entity.YearlyStorageReport;
import sjsu.cmpe272.svc.MongoSvc;

@RestController
public class MainController {

	@Autowired
	MongoSvc mongoSvc;

	/*
	 * @RequestMapping(value = "/reservoir", method = RequestMethod.GET)
	 * 
	 * @ResponseBody public Reservoir getReservoir(
	 * 
	 * @RequestParam(value = "reservoirId") String idFromHTTPRequest) { return
	 * mongoSvc.findReservoirById(idFromHTTPRequest); }
	 */

	@RequestMapping(value = "/reservoir/{reservoirId}", method = RequestMethod.GET)
	@ResponseBody
	public Reservoir getReservoirDoc(@PathVariable String reservoirId) {
		return mongoSvc.findReservoirDoc(reservoirId);
	}

	@RequestMapping(value = "/forecast/{reservoirId}", method = RequestMethod.GET)
	@ResponseBody
	public Forecast getForecast(@PathVariable String reservoirId) {
		return mongoSvc.findForecastById(reservoirId);
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	@ResponseBody
	public List<Reservoir> getHome() {
		return mongoSvc.getReservoirStorageInfo();
	}
	
	@RequestMapping(value = "/home/monthlyReport", method = RequestMethod.GET)
	@ResponseBody
	public List<MonthlyReport> getMonthlyReport() {
		return mongoSvc.getMonthly();
	}
	
	@RequestMapping(value = "/home/monthlyForecastReport", method = RequestMethod.GET)
	@ResponseBody
	public List<RegressionForecast> getMonthlyForecastReport() {
		return mongoSvc.linearRegression();
	}
	
	@RequestMapping(value = "/home/monthlyReportInflow", method = RequestMethod.GET)
	@ResponseBody
	public List<MonthlyReportInflow> getMonthlyReportInflow() {
		return mongoSvc.getMonthlyInflow();
	}
	
	@RequestMapping(value = "/home/monthlyReportOutflow", method = RequestMethod.GET)
	@ResponseBody
	public List<MonthlyReportOutflow> getMonthlyReportOutflow() {
		return mongoSvc.getMonthlyOutflow();
	}
	
	@RequestMapping(value = "/home/yearlyStorageReport", method = RequestMethod.GET)
	@ResponseBody
	public List<YearlyStorageReport> getyearlyReport() {
		return mongoSvc.getyearlyStorage();
	}
	
	@RequestMapping(value = "/home/yearlyInflowReport", method = RequestMethod.GET)
	@ResponseBody
	public List<YearlyInflowReport> getyearlyInflowReport() {
		return mongoSvc.getyearlyInflow();
	}
	
	@RequestMapping(value = "/home/yearlyOutflowReport", method = RequestMethod.GET)
	@ResponseBody
	public List<YearlyReportOutflow> getyearlyOutflowReport() {
		return mongoSvc.getyearlyOutflow();
	}
}
