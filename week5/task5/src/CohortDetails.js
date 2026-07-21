import React from 'react';
import styles from './CohortDetails.module.css';

export const CohortDetails = ({ code, name, start, status, coach, trainer }) => {
    
    const headingStyle = {
        color: status.toLowerCase() === 'ongoing' ? 'green' : 'blue'
    };

    return (
        <div className={styles.box}>
            <h3 style={headingStyle}>{code} - {name}</h3>
            <dl>
                <dt>Started On</dt>
                <dd>{start}</dd>
                <dt>Current Status</dt>
                <dd>{status}</dd>
                <dt>Coach</dt>
                <dd>{coach}</dd>
                <dt>Trainer</dt>
                <dd>{trainer}</dd>
            </dl>
        </div>
    );
};