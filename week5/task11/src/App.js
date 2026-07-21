import React, { Component } from 'react';
import { CurrencyConvertor } from './Components/CurrencyConvertor';

class App extends Component {
    constructor(props) {
        super(props);
        this.state = { counter: 5 }; // Initializing counter at 5 like the lab screenshot
        
        // Explicitly binding methods to 'this'[cite: 6]
        this.increment = this.increment.bind(this);
        this.decrement = this.decrement.bind(this);
    }

    // Increase the value of the counter and display a static message[cite: 6]
    increment() {
        this.setState({ counter: this.state.counter + 1 });
        alert("Hello! Member" + (this.state.counter + 1));
    }

    // Decrease the value of the counter[cite: 6]
    decrement() {
        this.setState({ counter: this.state.counter - 1 });
    }

    // Invokes the function which takes "welcome" as an argument[cite: 6]
    sayWelcome(message) {
        alert(message);
    }

    // Synthetic event "OnPress" which display "I was clicked"[cite: 6]
    onPress = (e) => {
        alert("I was clicked");
    }

    render() {
        return (
            <div style={{ padding: '20px' }}>
                <p><b>{this.state.counter}</b></p>
                
                <button onClick={this.increment}>Increment</button><br/>
                <button onClick={this.decrement}>Decrement</button><br/>
                {/* Passing an argument to the event handler[cite: 6] */}
                <button onClick={() => this.sayWelcome("welcome")}>Say welcome</button><br/>
                <button onClick={this.onPress}>Click on me</button><br/>
                
                <br/><br/>
                <CurrencyConvertor />
            </div>
        );
    }
}

export default App;