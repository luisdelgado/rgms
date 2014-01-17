package pages.thesis

import geb.Page
import pages.GetPageTitle
import rgms.publication.Tese

class ThesisShowPage extends Page {
    static url = "tese/show/1"

    static at = {
        GetPageTitle gp = new GetPageTitle()
        def currentTese = gp.msg("default.tese.label")
        def currentTitle = gp.msg("default.show.label", [currentTese])
        title ==~ currentTitle
	}
	
    static content = {
    }

    def select(String s) {
        $("form").find("input", value: s).click()
    }
}