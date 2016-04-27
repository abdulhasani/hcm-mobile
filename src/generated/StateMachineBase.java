/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("EmbeddedContainer", com.codename1.ui.util.EmbeddedContainer.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "Main";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("EmbeddedContainer", com.codename1.ui.util.EmbeddedContainer.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Main");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.TextField findTxtUsername(Component root) {
        return (com.codename1.ui.TextField)findByName("txtUsername", root);
    }

    public com.codename1.ui.TextField findTxtUsername() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("txtUsername", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("txtUsername", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.util.EmbeddedContainer findEmbeddedContainer(Component root) {
        return (com.codename1.ui.util.EmbeddedContainer)findByName("EmbeddedContainer", root);
    }

    public com.codename1.ui.util.EmbeddedContainer findEmbeddedContainer() {
        com.codename1.ui.util.EmbeddedContainer cmp = (com.codename1.ui.util.EmbeddedContainer)findByName("EmbeddedContainer", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.util.EmbeddedContainer)findByName("EmbeddedContainer", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnLogin(Component root) {
        return (com.codename1.ui.Button)findByName("btnLogin", root);
    }

    public com.codename1.ui.Button findBtnLogin() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btnLogin", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btnLogin", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findLapisKe3(Component root) {
        return (com.codename1.ui.Container)findByName("lapisKe3", root);
    }

    public com.codename1.ui.Container findLapisKe3() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("lapisKe3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("lapisKe3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findLapisKe2(Component root) {
        return (com.codename1.ui.Container)findByName("lapisKe2", root);
    }

    public com.codename1.ui.Container findLapisKe2() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("lapisKe2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("lapisKe2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.util.EmbeddedContainer findEmbeddedContainer1(Component root) {
        return (com.codename1.ui.util.EmbeddedContainer)findByName("EmbeddedContainer1", root);
    }

    public com.codename1.ui.util.EmbeddedContainer findEmbeddedContainer1() {
        com.codename1.ui.util.EmbeddedContainer cmp = (com.codename1.ui.util.EmbeddedContainer)findByName("EmbeddedContainer1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.util.EmbeddedContainer)findByName("EmbeddedContainer1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.util.EmbeddedContainer findEmbeddedContainer2(Component root) {
        return (com.codename1.ui.util.EmbeddedContainer)findByName("EmbeddedContainer2", root);
    }

    public com.codename1.ui.util.EmbeddedContainer findEmbeddedContainer2() {
        com.codename1.ui.util.EmbeddedContainer cmp = (com.codename1.ui.util.EmbeddedContainer)findByName("EmbeddedContainer2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.util.EmbeddedContainer)findByName("EmbeddedContainer2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtPassword(Component root) {
        return (com.codename1.ui.TextField)findByName("txtPassword", root);
    }

    public com.codename1.ui.TextField findTxtPassword() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("txtPassword", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("txtPassword", aboutToShowThisContainer);
        }
        
        return cmp;
    }

    public static final int COMMAND_MainDocumentsHome = 1;
    public static final int COMMAND_MainDocumentsMySubordinates = 3;
    public static final int COMMAND_MainDocumentsMyDocuments = 2;

    protected boolean onMainDocumentsHome() {
        return false;
    }

    protected boolean onMainDocumentsMySubordinates() {
        return false;
    }

    protected boolean onMainDocumentsMyDocuments() {
        return false;
    }

    protected void processCommand(ActionEvent ev, Command cmd) {
        switch(cmd.getId()) {
            case COMMAND_MainDocumentsHome:
                if(onMainDocumentsHome()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainDocumentsMySubordinates:
                if(onMainDocumentsMySubordinates()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainDocumentsMyDocuments:
                if(onMainDocumentsMyDocuments()) {
                    ev.consume();
                    return;
                }
                break;

        }
        if(ev.getComponent() != null) {
            handleComponentAction(ev.getComponent(), ev);
        }
    }

    protected void exitForm(Form f) {
        if("mainSubordinates".equals(f.getName())) {
            exitMainSubordinates(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("mainHome".equals(f.getName())) {
            exitMainHome(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("mainDocuments".equals(f.getName())) {
            exitMainDocuments(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitMainSubordinates(Form f) {
    }


    protected void exitMainHome(Form f) {
    }


    protected void exitMainDocuments(Form f) {
    }


    protected void exitMain(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("mainSubordinates".equals(f.getName())) {
            beforeMainSubordinates(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("mainHome".equals(f.getName())) {
            beforeMainHome(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("mainDocuments".equals(f.getName())) {
            beforeMainDocuments(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeMainSubordinates(Form f) {
    }


    protected void beforeMainHome(Form f) {
    }


    protected void beforeMainDocuments(Form f) {
    }


    protected void beforeMain(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("mainSubordinates".equals(c.getName())) {
            beforeContainerMainSubordinates(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("mainHome".equals(c.getName())) {
            beforeContainerMainHome(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("mainDocuments".equals(c.getName())) {
            beforeContainerMainDocuments(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerMainSubordinates(Container c) {
    }


    protected void beforeContainerMainHome(Container c) {
    }


    protected void beforeContainerMainDocuments(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }

    protected void postShow(Form f) {
        if("mainSubordinates".equals(f.getName())) {
            postMainSubordinates(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("mainHome".equals(f.getName())) {
            postMainHome(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("mainDocuments".equals(f.getName())) {
            postMainDocuments(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postMainSubordinates(Form f) {
    }


    protected void postMainHome(Form f) {
    }


    protected void postMainDocuments(Form f) {
    }


    protected void postMain(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("mainSubordinates".equals(c.getName())) {
            postContainerMainSubordinates(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("mainHome".equals(c.getName())) {
            postContainerMainHome(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("mainDocuments".equals(c.getName())) {
            postContainerMainDocuments(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerMainSubordinates(Container c) {
    }


    protected void postContainerMainHome(Container c) {
    }


    protected void postContainerMainDocuments(Container c) {
    }


    protected void postContainerMain(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("mainSubordinates".equals(rootName)) {
            onCreateMainSubordinates();
            aboutToShowThisContainer = null;
            return;
        }

        if("mainHome".equals(rootName)) {
            onCreateMainHome();
            aboutToShowThisContainer = null;
            return;
        }

        if("mainDocuments".equals(rootName)) {
            onCreateMainDocuments();
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateMainSubordinates() {
    }


    protected void onCreateMainHome() {
    }


    protected void onCreateMainDocuments() {
    }


    protected void onCreateMain() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("mainSubordinates".equals(f.getName())) {
            getStateMainSubordinates(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("mainHome".equals(f.getName())) {
            getStateMainHome(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("mainDocuments".equals(f.getName())) {
            getStateMainDocuments(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateMainSubordinates(Form f, Hashtable h) {
    }


    protected void getStateMainHome(Form f, Hashtable h) {
    }


    protected void getStateMainDocuments(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("mainSubordinates".equals(f.getName())) {
            setStateMainSubordinates(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("mainHome".equals(f.getName())) {
            setStateMainHome(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("mainDocuments".equals(f.getName())) {
            setStateMainDocuments(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateMainSubordinates(Form f, Hashtable state) {
    }


    protected void setStateMainHome(Form f, Hashtable state) {
    }


    protected void setStateMainDocuments(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("Main")) {
            if("txtUsername".equals(c.getName())) {
                onMain_TxtUsernameAction(c, event);
                return;
            }
            if("txtPassword".equals(c.getName())) {
                onMain_TxtPasswordAction(c, event);
                return;
            }
            if("btnLogin".equals(c.getName())) {
                onMain_BtnLoginAction(c, event);
                return;
            }
        }
    }

      protected void onMain_TxtUsernameAction(Component c, ActionEvent event) {
      }

      protected void onMain_TxtPasswordAction(Component c, ActionEvent event) {
      }

      protected void onMain_BtnLoginAction(Component c, ActionEvent event) {
      }

}
