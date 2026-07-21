import { CohortDetails } from './CohortDetails';

function App() {
  return (
    <div style={{ padding: '20px' }}>
      <h1>Cohorts Details</h1>
      {/* We are passing props to populate our styled component */}
      <CohortDetails code="INTADMDF10" name=".NET FSD" start="22-Feb-2022" status="Scheduled" coach="Aathma" trainer="Jojo Jose" />
      <CohortDetails code="ADM21JF014" name="Java FSD" start="10-Sep-2021" status="Ongoing" coach="Apoorv" trainer="Elisa Smith" />
      <CohortDetails code="CDBJF21025" name="Java FSD" start="24-Dec-2021" status="Ongoing" coach="Aathma" trainer="John Doe" />
    </div>
  );
}

export default App;