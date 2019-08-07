package jp.co.systena.tigerscave.springtest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




// Viewありコントローラを定義するアノテーション
// 返り値は、Stringでテンプレート名などを指定するか、ModelAndViewクラスを返す
@Controller
public class ListController{
	@RequestMapping("/ListView") // URLとのマッピング
	public ModelAndView index(ModelAndView mav) {
		ListService service = new ListService();
		List<Item> itemList = service.getItemList();

		mav.addObject("itemList", itemList);

		List<Integer> num = new ArrayList<>();
		for(int i = 0; i <= 10; i++) {
			num.add(i);
		}
		mav.addObject("num", num);
		mav.setViewName("/ListView.html");
		return mav;
	}


}

