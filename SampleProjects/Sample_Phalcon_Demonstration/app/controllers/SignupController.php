<?php
/**
 * Created by IntelliJ IDEA.
 * User: Dishan Croning
 * Date: 11/28/2015
 * Time: 12:19 AM
 */

use Phalcon\Mvc\Controller;

class SignupController extends Controller
{
    public function indexAction()
    {

    }
    public function registerAction()
    {
        $user = new Users();

        // Store and check for errors
        $success = $user->save($this->request->getPost(), array('name', 'email'));

        if ($success) {
            echo "Thanks for registering!";
        } else {
            echo "Sorry, the following problems were generated: ";
            foreach ($user->getMessages() as $message) {
                echo $message->getMessage(), "<br/>";
            }
        }

        $this->view->disable();
    }
}
?>