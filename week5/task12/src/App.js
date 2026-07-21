import React, { Component } from 'react';
import { Greeting } from './Components/Greeting';
import { LoginButton, LogoutButton } from './Components/Buttons';

class App extends Component {
    constructor(props) {
        super(props);
        this.state = { isLoggedIn: false }; // Users start logged out
        
        // Bind the event handlers
        this.handleLoginClick = this.handleLoginClick.bind(this);
        this.handleLogoutClick = this.handleLogoutClick.bind(this);
    }

    handleLoginClick() {
        this.setState({ isLoggedIn: true });
    }

    handleLogoutClick() {
        this.setState({ isLoggedIn: false });
    }

    render() {
        const isLoggedIn = this.state.isLoggedIn;
        
        // Define an element variable to hold our button[cite: 7]
        let button;

        // Conditionally assign the correct button component to the variable[cite: 7]
        if (isLoggedIn) {
            button = <LogoutButton onClick={this.handleLogoutClick} />;
        } else {
            button = <LoginButton onClick={this.handleLoginClick} />;
        }

        return (
            <div style={{ padding: '50px', textAlign: 'center' }}>
                {/* Pass the state to the Greeting component[cite: 7] */}
                <Greeting isLoggedIn={isLoggedIn} />
                
                {/* Render the element variable[cite: 7] */}
                {button}
            </div>
        );
    }
}

export default App;