package fr.husta.test.action.ajax;

import com.opensymphony.xwork2.ActionSupport;
import fr.husta.test.dto.TrucDto;
import fr.husta.test.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Use struts2-json-plugin
 */
public class GetAjaxListAction
        extends ActionSupport {

    @Autowired
    private StoreService storeService;

    private List<TrucDto> listItems;

    public List<TrucDto> getListItems() {
        return listItems;
    }

    @Override
    public String execute() throws Exception {
        listItems = storeService.getListItems();

        return SUCCESS;
    }
}
