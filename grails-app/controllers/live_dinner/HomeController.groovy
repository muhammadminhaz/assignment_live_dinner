package live_dinner

class HomeController {

    def index() {
        def dinnerList = Dinner.list()
        [dinnerList: dinnerList]
        def lunchList = Lunch.list()
        [lunchList: lunchList]
        def drinksList = Drinks.list()
        [drinksList: drinksList]
    }
    def about() { }
    def blog() { }
    def blog_details() { }
    def contact() { }
    def gallery() { }
    def menu() { }
    def reservation() { }
    def stuff() { }
    def sendEmail() {
        sendMail {
            to params.email
            subject "Reservation from " + params.name
            body 'Name: ' + params.name + '\n' + 'Phone number: ' + params.phone + '\n' + 'Date: ' + params.date + '\n' + 'Time:' + params.time
        }

        flash.message = "Message sent at "+new Date()
        redirect action:"index"
    }

    def sendMessage() {
        sendMail {
            to params.email
            subject "Message from " + params.name
            body 'Name: ' + params.name + '\n' + 'Message: ' + params.message + '\n'
        }

        flash.message = "Message sent at "+new Date()
        redirect action:"index"
    }
}
